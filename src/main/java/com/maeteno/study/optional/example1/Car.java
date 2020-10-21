package com.maeteno.study.optional.example1;

import java.util.Optional;

public class Car {
    private final Optional<Insurance> insurance = Optional.empty();

    public Optional<Insurance> getInsurance() {
        return this.insurance;
    }
}