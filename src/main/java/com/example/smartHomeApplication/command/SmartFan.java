package com.example.smartHomeApplication.command;

import com.example.smartHomeApplication.decorator.Feature;

public class SmartFan implements SmartAppliances {
    @Override
    public void start() {
        System.out.println("Stating Fan");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Fan");
    }

    @Override
    public String add(Feature feature) {
        return feature.add();
    }

}
