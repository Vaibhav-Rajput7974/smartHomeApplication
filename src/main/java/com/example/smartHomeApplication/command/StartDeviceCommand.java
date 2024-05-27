package com.example.smartHomeApplication.command;

import com.example.smartHomeApplication.adapter.DeviceCommand;

public class StartDeviceCommand implements DeviceCommand {
    private SmartAppliances smartAppliances;

    public StartDeviceCommand(SmartAppliances smartAppliances) {
        this.smartAppliances = smartAppliances;
    }

    @Override
    public void exicute() {
        smartAppliances.start();
    }

}