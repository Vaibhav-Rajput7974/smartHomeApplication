package com.example.smartHomeApplication.strategy;

public class QuickCool implements TemperatureControl {
    @Override
    public String cool() {
        return " quick cooling started ";
    }
}
