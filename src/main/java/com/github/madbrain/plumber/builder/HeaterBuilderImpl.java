package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.Heater;

public class HeaterBuilderImpl extends NextElementBuilderImpl<Heater> implements HeaterBuilder {
    public HeaterBuilderImpl(NetworkBuilder networkBuilder, Heater heater) {
        super(networkBuilder, heater);
    }

    @Override
    public HeaterBuilder power(double value, PowerUnit unit) {
        element.setPower(unit.getPower(value));
        return this;
    }
}
