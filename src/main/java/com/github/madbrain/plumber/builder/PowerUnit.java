package com.github.madbrain.plumber.builder;

public enum PowerUnit {
    W(1),
    KW(1000);

    private final int scale;

    PowerUnit(int scale) {
        this.scale = scale;
    }

    public double getPower(double value) {
        return value * scale;
    }
}
