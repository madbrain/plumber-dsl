package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.*;

public class NewElementBuilderImpl implements NewElementBuilder {

    protected final NetworkBuilder networkBuilder;

    public NewElementBuilderImpl(NetworkBuilder networkBuilder) {
        this.networkBuilder = networkBuilder;
    }

    @Override
    public PumpBuilder pump() {
        return pump(null);
    }

    @Override
    public PumpBuilder pump(String name) {
        return  new PumpBuilderImpl(networkBuilder, processNewElement(new Pump(), name));
    }

    @Override
    public FilterBuilder filter() {
        return filter(null);
    }

    @Override
    public FilterBuilder filter(String name) {
        return new FilterBuilderImpl(networkBuilder, processNewElement(new Filter(), name));
    }

    @Override
    public HeaterBuilder heater() {
        return heater(null);
    }

    @Override
    public HeaterBuilder heater(String name) {
        return new HeaterBuilderImpl(networkBuilder, processNewElement(new Heater(), name));
    }

    @Override
    public NextElementBuilder inlet(String name) {
        return new NextElementBuilderImpl<>(networkBuilder, processNewElement(new Inlet(), name));
    }

    @Override
    public NextElementBuilder outlet(String name) {
        return new NextElementBuilderImpl<>(networkBuilder, processNewElement(new Outlet(), name));
    }

    @Override
    public NextElementBuilder valve() {
        return valve(null);
    }

    @Override
    public NextElementBuilder valve(String name) {
        return new NextElementBuilderImpl<>(networkBuilder, processNewElement(new Valve(), name));
    }

    @Override
    public NextElementBuilder mixer() {
        return new NextElementBuilderImpl<>(networkBuilder, processNewElement(new Mixer(), null));
    }

    @Override
    public NextElementBuilder accumulator(String name) {
        return new NextElementBuilderImpl<>(networkBuilder, processNewElement(new Accumulator(), name));
    }

    @Override
    public NextElementBuilder ref(String name) {
        return new NextElementBuilderImpl<>(networkBuilder, networkBuilder.get(name));
    }

    @Override
    public CombinedElementBuilder combine(String name) {
        return new CombinedElementBuilderImpl(networkBuilder, networkBuilder.get(name));
    }

    @Override
    public Network build() {
        return networkBuilder.build();
    }

    private <T extends NetworkElementBase> T processNewElement(T element, String name) {
        element.setName(name);
        networkBuilder.add(element);
        onNewElement(element);
        return element;
    }

    protected void onNewElement(NetworkElement element) {
    }
}
