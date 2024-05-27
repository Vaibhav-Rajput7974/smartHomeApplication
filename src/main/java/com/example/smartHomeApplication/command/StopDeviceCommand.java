package com.example.smartHomeApplication.command;

import com.example.smartHomeApplication.adapter.DeviceCommand;

public class StopDeviceCommand implements DeviceCommand {
    private SmartAppliances smartAppliances;

    public StopDeviceCommand(SmartAppliances smartAppliances) {
        this.smartAppliances = smartAppliances;
    }

    @Override
    public void exicute() {
        smartAppliances.stop();
    }
}