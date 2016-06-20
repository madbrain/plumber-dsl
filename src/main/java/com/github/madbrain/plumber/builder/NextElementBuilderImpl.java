package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.NetworkElement;

import java.util.Collections;

public class NextElementBuilderImpl<T extends NetworkElement> extends NewElementBuilderImpl implements NextElementBuilder {

    protected final T element;

    public NextElementBuilderImpl(NetworkBuilder networkBuilder, T element) {
        super(networkBuilder);
        this.element = element;
    }

    @Override
    public NewElementBuilder pipe() {
        return new PipedElementsBuilderImpl(networkBuilder, Collections.singletonList(element));
    }
}
