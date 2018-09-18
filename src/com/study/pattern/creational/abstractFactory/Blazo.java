package com.study.pattern.creational.abstractFactory;

public class Blazo implements Truck {

	@Override
	public void drive() {
		System.out.println("Riding => " + this.getClass().getName());
	}

}
