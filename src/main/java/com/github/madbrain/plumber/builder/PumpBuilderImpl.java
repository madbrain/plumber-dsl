package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.Pump;

public class PumpBuilderImpl extends NextElementBuilderImpl<Pump> implements PumpBuilder {

    public PumpBuilderImpl(NetworkBuilder networkBuilder, Pump pump) {
        super(networkBuilder, pump);
    }

    @Override
    public PumpBuilder power(double value, PowerUnit unit) {
        element.setPower(unit.getPower(value));
        return this;
    }

    @Override
    public PumpBuilder pressure(double value) {
        element.setPressure(value);
        return this;
    }
}
