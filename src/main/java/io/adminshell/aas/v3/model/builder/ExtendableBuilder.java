

package io.adminshell.aas.v3.model.builder;

public abstract class ExtendableBuilder<T, B extends ExtendableBuilder<T, B>> extends AbstractBuilder<T> {

    protected abstract B getSelf();

}
