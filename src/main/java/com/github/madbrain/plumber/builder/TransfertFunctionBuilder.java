package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.TransfertFunction;

public interface TransfertFunctionBuilder {
    TransfertFunctionBuilder x(int power);
    TransfertFunctionBuilder c(double value);

    TransfertFunction build();
}
