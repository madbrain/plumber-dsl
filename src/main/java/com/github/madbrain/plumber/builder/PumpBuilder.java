package com.github.madbrain.plumber.builder;

public interface PumpBuilder extends NextElementBuilder {
    PumpBuilder power(double value, PowerUnit unit);
    PumpBuilder pressure(double value);
}
