package com.study.pattern.creational.abstractFactory;

public class XUV500 implements SUV {

	@Override
	public void drive() {
		System.out.println("Riding => " + this.getClass().getName());
	}

}
