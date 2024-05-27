package com.example.smartHomeApplication.command;

import com.example.smartHomeApplication.decorator.Feature;

public interface SmartAppliances {
    void start();
    void stop();

    String add(Feature feature);
}
