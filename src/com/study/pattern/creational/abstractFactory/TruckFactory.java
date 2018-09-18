package com.study.pattern.creational.abstractFactory;

public class TruckFactory extends MahindraAbstractFactory{
	
	public Truck getTruck(String model) {
		if( null == model) {
			return null;
		} else if ("Nova".equalsIgnoreCase(model)) {
			return new Nova();
		} else if ("Blazo".equalsIgnoreCase(model)) {
			return new Blazo();
		}
		return null;
	}

	@Override
	public SUV getSUV(String model) {
		return null;
	}

}
