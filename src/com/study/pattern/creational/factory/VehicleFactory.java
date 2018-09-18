package com.study.pattern.creational.factory;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType) {
		if (vehicleType == null) {
			return null;
		} else if ("car".equalsIgnoreCase(vehicleType)) {
			return new Car();
		} else if ("bus".equalsIgnoreCase(vehicleType)) {
			return new Bus();
		}
		return null;
	}

}
