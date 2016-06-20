package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.Filter;
import com.github.madbrain.plumber.model.TransfertFunction;

public class FilterBuilderImpl extends NextElementBuilderImpl<Filter> implements FilterBuilder {
    public FilterBuilderImpl(NetworkBuilder networkBuilder, Filter filter) {
        super(networkBuilder, filter);
    }

    @Override
    public FilterBuilder transfert(TransfertFunction value) {
        this.element.setTransfert(value);
        return this;
    }

    @Override
    public FilterBuilder transfert(TransfertFunctionBuilder builder) {
        this.element.setTransfert(builder.build());
        return this;
    }
}
