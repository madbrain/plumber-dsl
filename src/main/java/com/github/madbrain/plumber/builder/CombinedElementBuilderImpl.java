package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.NetworkElement;

import java.util.ArrayList;
import java.util.List;

public class CombinedElementBuilderImpl extends NewElementBuilderImpl implements CombinedElementBuilder {

    private List<NetworkElement> elements = new ArrayList<>();

    public CombinedElementBuilderImpl(NetworkBuilder networkBuilder, NetworkElement element) {
        super(networkBuilder);
        elements.add(element);
    }

    @Override
    public CombinedElementBuilder with(String name) {
        elements.add(networkBuilder.get(name));
        return this;
    }

    @Override
    public NewElementBuilder pipe() {
        return new PipedElementsBuilderImpl(networkBuilder, elements);
    }

}
