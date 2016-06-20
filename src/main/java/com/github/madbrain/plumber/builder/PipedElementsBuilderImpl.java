package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.NetworkElement;
import com.github.madbrain.plumber.model.Pipe;

import java.util.List;

public class PipedElementsBuilderImpl extends NewElementBuilderImpl {

    private final List<NetworkElement> elements;

    public PipedElementsBuilderImpl(NetworkBuilder networkBuilder, List<NetworkElement> elements) {
        super(networkBuilder);
        this.elements = elements;
    }

    @Override
    protected void onNewElement(NetworkElement to) {
        for (NetworkElement element : elements) {
            networkBuilder.addPipe(new Pipe(element, to));
        }
    }
}
