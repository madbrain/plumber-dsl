package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.Network;

public interface NewElementBuilder {
    PumpBuilder pump();
    PumpBuilder pump(String name);
    FilterBuilder filter();
    FilterBuilder filter(String name);
    HeaterBuilder heater();
    HeaterBuilder heater(String name);

    NextElementBuilder inlet(String name);
    NextElementBuilder outlet(String name);
    NextElementBuilder valve();
    NextElementBuilder valve(String name);
    NextElementBuilder mixer();
    NextElementBuilder accumulator(String name);

    NextElementBuilder ref(String name);
    CombinedElementBuilder combine(String ref);

    Network build();
}
