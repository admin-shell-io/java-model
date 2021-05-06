package de.fraunhofer.iais.eis.builder;

public abstract class AbstractBuilder<T> implements Builder<T> {

    private final T buildingInstance;

    protected AbstractBuilder() {
        buildingInstance = newBuildingInstance();
    }

    protected abstract T newBuildingInstance();

    protected T getBuildingInstance() {
        return buildingInstance;
    }

    @Override
    public T build() {
        return buildingInstance;
    }
}
