package com.study.pattern.creational.abstractFactory;

public class Customer {

	public static void main(String[] args) {
		// To decide what to buy : Truck or Car
		// Based on that, we need to goto the correct factory
		
		//considering we need SUV
		MahindraAbstractFactory factory = FactoryGenerator.getFactory("SUV");
		
		//to decide on what product to buy
		SUV mySUV = factory.getSUV("XUV500");
		mySUV.drive();
		
		
		//considering we need truck
		factory = FactoryGenerator.getFactory("Truck");
		Truck myTruck = factory.getTruck("Nova");
		myTruck.drive();
		
	}

}
