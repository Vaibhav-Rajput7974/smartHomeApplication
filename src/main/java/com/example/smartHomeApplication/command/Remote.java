package com.example.smartHomeApplication.command;

import com.example.smartHomeApplication.adapter.Device;

public class Remote {
    private Device device;

    public void setControl(Device device) {
        this.device = device;
    }

    public void exicute(){
        device.exicute();
    }
}
