package de.fraunhofer.iais.eis;

public class MySubSubmodel extends MySubmodel {

    protected String additionalProperty2;

    public String getAdditionalProperty2() {
        return additionalProperty2;
    }

    public static abstract class AbstractBuilder<T extends MySubSubmodel, B extends AbstractBuilder<T, B>> extends MySubmodel.AbstractBuilder<T, B> {

        public B additionalProperty2(String value) {
            getBuildingInstance().additionalProperty2 = value;
            return getSelf();
        }

    }

    public static class Builder extends AbstractBuilder<MySubSubmodel, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected MySubSubmodel newBuildingInstance() {
            return new MySubSubmodel();
        }
    }
}
