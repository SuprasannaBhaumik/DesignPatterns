package com.study.pattern.creational.abstractFactory;

public class KUV implements SUV {

	@Override
	public void drive() {
		System.out.println("Riding => " + this.getClass().getName());
	}

}
