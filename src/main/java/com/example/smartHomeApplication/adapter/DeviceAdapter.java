package com.example.smartHomeApplication.adapter;

public class DeviceAdapter implements Device {
    private DeviceCommand deviceCommand;

    public DeviceAdapter(DeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
    }

    @Override
    public void exicute() {
        deviceCommand.exicute();
    }
}
