package com.example.smartHomeApplication;

import com.example.smartHomeApplication.adapter.Device;
import com.example.smartHomeApplication.adapter.DeviceAdapter;
import com.example.smartHomeApplication.adapter.DeviceCommand;
import com.example.smartHomeApplication.command.*;
import com.example.smartHomeApplication.decorator.CommonFeature;
import com.example.smartHomeApplication.decorator.Feature;
import com.example.smartHomeApplication.decorator.PowerSaving;
import com.example.smartHomeApplication.decorator.VacationMode;
import com.example.smartHomeApplication.strategy.EcoFriendly;
import com.example.smartHomeApplication.strategy.QuickCool;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartHomeApplication {

	public static void main(String[] args) {

		// commond pattern
		SmartRefrigerator smartRefrigerator = new SmartRefrigerator();
		SmartFan smartFan = new SmartFan();
		DeviceCommand startRefrigerator = new StartDeviceCommand(smartRefrigerator);
		DeviceCommand stopFan = new StopDeviceCommand(smartFan);
		Remote remote = new Remote();

		// decorator pattern
		Feature AllFeature = new PowerSaving(new VacationMode(new CommonFeature()));
		System.out.println(smartFan.add(AllFeature));


		// Strategy Pattern
		smartRefrigerator.adjustTemperature(new EcoFriendly());
		smartRefrigerator.adjustTemperature(new QuickCool());

		// Adapter pattern
		Device device = new DeviceAdapter(stopFan);
		remote.setControl(device);
		remote.exicute();
	}

}
