package com.study.pattern.creational.abstractFactory;

public class Nova implements Truck {

	@Override
	public void drive() {
		System.out.println("Riding => " + this.getClass().getName());
	}

}
