package io.adminshell.aas.v3.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import de.fraunhofer.iais.eis.util.RdfResource;

public class Util {

    public static <T> ArrayList<T> asList(T... elements) {
        return new ArrayList<T>(Arrays.asList(elements));
    }

    public static Object clone(Object object) {
        if (object instanceof ModelClass) {
            return ((ModelClass) object).deepCopy();
        } else if (object instanceof List) {
            return ((List<?>) object).stream().map(Util::clone).collect(Collectors.toList());
        } else if (object instanceof URI) {
            return URI.create(object.toString());
        } else if (object instanceof XMLGregorianCalendar) {
            return ((XMLGregorianCalendar) object).clone();
        } else if (object instanceof byte[]) {
            return ((byte[]) object).clone();
        } else if (object instanceof Byte[]) {
            return ((Byte[]) object).clone();
        } else if (object instanceof RdfResource) {
            return new RdfResource(((RdfResource) object).getValue(), URI.create(((RdfResource) object).getType()));
        } else {
            // basic java classes like String that are not copied by Reference
            return object;
        }
    }

    public static <T> T fillInstanceFromMap(T instance, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String fieldName = entry.getKey();
            String capitalizedFieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            Object fieldValue = entry.getValue();
            try {
                if (fieldValue != null) {
                    Class<?> clazz = instance.getClass().getMethod("get" + capitalizedFieldName).getReturnType();
                    Method setterMethod = instance.getClass().getMethod("set" + capitalizedFieldName, clazz);
                    try {
                        setterMethod.invoke(instance, fieldValue);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        // e.printStackTrace();
                    }
                }
            } catch (NoSuchMethodException e) {
                // e.printStackTrace();
            }
        }
        return instance;
    }

}
