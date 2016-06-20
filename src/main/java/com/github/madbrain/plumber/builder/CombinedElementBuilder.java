package com.github.madbrain.plumber.builder;

public interface CombinedElementBuilder extends NextElementBuilder {
    CombinedElementBuilder with(String name);
}
