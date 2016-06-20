package com.github.madbrain.plumber.builder;

public interface HeaterBuilder extends NextElementBuilder {
    HeaterBuilder power(double value, PowerUnit unit);
}
