package com.github.madbrain.plumber.builder;

import com.github.madbrain.plumber.model.Network;
import com.github.madbrain.plumber.model.TransfertFunction;

public interface FilterBuilder extends NextElementBuilder {
    FilterBuilder transfert(TransfertFunction value);
    FilterBuilder transfert(TransfertFunctionBuilder builder);
}
