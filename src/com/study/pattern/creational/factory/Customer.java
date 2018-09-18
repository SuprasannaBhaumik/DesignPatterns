package com.study.pattern.creational.factory;

public class Customer {

	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		
		Vehicle vehicle = factory.getVehicle("car");
		vehicle.constructVehicle();
		
		//based on the type, we are getting the object
		vehicle = factory.getVehicle("bus");
		vehicle.constructVehicle();
		
	}

}
