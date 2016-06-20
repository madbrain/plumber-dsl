package com.github.madbrain.plumber.model;

public class Pipe {
    private final NetworkElement from;
    private final NetworkElement to;

    public Pipe(NetworkElement from, NetworkElement to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return from + " -> " + to;
    }
}
