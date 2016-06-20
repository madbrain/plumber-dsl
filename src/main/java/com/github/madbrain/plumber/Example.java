package com.github.madbrain.plumber;

import com.github.madbrain.plumber.builder.NetworkBuilder;
import com.github.madbrain.plumber.builder.PowerUnit;
import com.github.madbrain.plumber.model.Network;

import static com.github.madbrain.plumber.builder.PolynomialFunctions.x;

public class Example {
    public static void main(String[] args) {
        Network network = NetworkBuilder.newBuilder()
            .inlet("main").pipe().valve().pipe().filter("f1").transfert(x(2).c(1))
            .ref("f1").pump().power(500, PowerUnit.W).pressure(1)
                .pipe().heater().power(2, PowerUnit.KW)
                .pipe().accumulator("acc")
                .pipe().outlet("o1")
            .ref("f1").pipe().valve("v1").pipe().outlet("o2")
            .combine("v1").with("acc").pipe().mixer().pipe().outlet("o3")
            .build();

        System.out.println(network);
    }
}
