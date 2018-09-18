package com.study.pattern.creational.abstractFactory;

public class FactoryGenerator {
	
	public static MahindraAbstractFactory getFactory(String factoryName) {
		if("SUV".equalsIgnoreCase(factoryName)) {
			return new SUVFactory();
		} else if ("Truck".equalsIgnoreCase(factoryName)) {
			return new TruckFactory();
		}
		return null;
	}

}
