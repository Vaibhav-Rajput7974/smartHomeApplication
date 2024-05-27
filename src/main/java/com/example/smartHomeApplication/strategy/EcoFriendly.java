package com.example.smartHomeApplication.strategy;

public class EcoFriendly implements TemperatureControl {
    @Override
    public String cool() {
        return " normally ecoFriendly cooling started ";
    }
}
