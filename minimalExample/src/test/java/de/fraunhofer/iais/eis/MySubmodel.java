package de.fraunhofer.iais.eis;

public class MySubmodel extends DefaultSubmodel {

    protected String additionalProperty;

    public String getAdditionalProperty() {
        return additionalProperty;
    }

    public static abstract class AbstractBuilder<T extends MySubmodel, B extends AbstractBuilder<T, B>> extends Submodel.AbstractBuilder<T, B> {

        public B additionalProperty(String value) {
            getBuildingInstance().additionalProperty = value;
            return getSelf();
        }

    }

    public static class Builder extends AbstractBuilder<MySubmodel, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected MySubmodel newBuildingInstance() {
            return new MySubmodel();
        }
    }
}
