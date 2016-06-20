package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.*;

import java.util.HashMap;
import java.util.Map;

public class NetworkBuilder {

    private Network network = new Network();
    private Map<String, NetworkElement> elementsByName = new HashMap<>();

    public static NewElementBuilder newBuilder() {
        return new NewElementBuilderImpl(new NetworkBuilder());
    }

    public void add(NetworkElement element) {
        this.network.add(element);
        if (element.getName() != null) {
            elementsByName.put(element.getName(), element);
        }
    }

    public void addPipe(Pipe pipe) {
        this.network.addPipe(pipe);
    }

    public NetworkElement get(String name) {
        if (! elementsByName.containsKey(name)) {
            throw new RuntimeException("cannot find element '" + name + "'");
        }
        return elementsByName.get(name);
    }

    public Network build() {
        return network;
    }
}
