package com.example.smartHomeApplication.decorator;

public class DecoratorAppliances implements Feature {
    protected Feature feature;

    public DecoratorAppliances(Feature feature) {
        this.feature = feature;
    }

    @Override
    public String add() {
        return feature.add();
    }
}
