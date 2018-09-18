package com.study.pattern.creational.abstractFactory;

public class SUVFactory extends MahindraAbstractFactory{
	
	public SUV getSUV(String model) {
		if( null == model) {
			return null;
		} else if ("XUV500".equalsIgnoreCase(model)) {
			return new XUV500();
		} else if ("TUV".equalsIgnoreCase(model)) {
			return new TUV();
		} else if ("KUV".equalsIgnoreCase(model)) {
			return new KUV();
		}
		return null;
	}

	@Override
	public Truck getTruck(String model) {
		return null;
	}

}
