package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.TransfertFunction;

public class TransfertFunctionBuilderImpl implements TransfertFunctionBuilder {

    @Override
    public TransfertFunctionBuilder x(int power) {
        return this;
    }

    @Override
    public TransfertFunctionBuilder c(double value) {
        return this;
    }

    @Override
    public TransfertFunction build() {
        return new TransfertFunction() {
            @Override
            public double evaluate(double x) {
                throw new RuntimeException(".evaluate not implemented");
            }
        };
    }
}
