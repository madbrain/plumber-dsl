package com.github.madbrain.plumber.model;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<NetworkElement> elements = new ArrayList<>();
    private List<Pipe> pipes = new ArrayList<>();

    public void add(NetworkElement element) {
        this.elements.add(element);
    }

    public void addPipe(Pipe pipe) {
        this.pipes.add(pipe);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Pipe pipe : pipes) {
            builder.append(pipe.toString()).append('\n');
        }
        return builder.toString();
    }
}
