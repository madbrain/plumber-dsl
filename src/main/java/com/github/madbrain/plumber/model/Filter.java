package com.github.madbrain.plumber.model;

public class Filter extends NetworkElementBase {

    private TransfertFunction transfert;

    public TransfertFunction getTransfert() {
        return transfert;
    }

    public void setTransfert(TransfertFunction transfert) {
        this.transfert = transfert;
    }
}
