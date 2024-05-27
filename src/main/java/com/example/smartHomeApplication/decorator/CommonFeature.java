package com.example.smartHomeApplication.decorator;

import com.example.smartHomeApplication.decorator.Feature;

public class CommonFeature implements Feature {
    @Override
    public String add() {
        return "Common feature ";
    }
}
