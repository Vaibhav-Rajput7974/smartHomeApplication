package com.example.smartHomeApplication.command;

import com.example.smartHomeApplication.strategy.TemperatureControl;
import com.example.smartHomeApplication.decorator.Feature;

public class SmartRefrigerator implements SmartAppliances {
    @Override
    public void start() {
        System.out.println("Started Cooling ");
    }

    @Override
    public void stop() {
        System.out.println("Stopping refrigerator");
    }

    @Override
    public String add(Feature feature) {
        return feature.add();
    }

    public void adjustTemperature(TemperatureControl temperatureControl){
        System.out.println(temperatureControl.cool());
    }
}
