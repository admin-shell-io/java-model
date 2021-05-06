package de.fraunhofer.iais.eis.builder;

public abstract class ExtendableBuilder<T, B extends ExtendableBuilder<T, B>> extends AbstractBuilder<T> {

    protected abstract B getSelf();

}
