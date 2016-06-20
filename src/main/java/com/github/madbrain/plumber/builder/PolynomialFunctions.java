package com.github.madbrain.plumber.builder;

public class PolynomialFunctions {
    public static TransfertFunctionBuilder x(int power) {
        return new TransfertFunctionBuilderImpl().x(power);
    }
}
