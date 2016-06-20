package com.github.madbrain.plumber.model;

public class NetworkElementBase implements NetworkElement {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + (name != null ? ":" + name : "");
    }
}
