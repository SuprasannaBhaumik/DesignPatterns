package com.study.pattern.behavioural.template;

public class GlassHouse extends HouseTemplate{

	@Override
	public void buildFoundation() {
		System.out.println("foundation same as it is");
	}

	@Override
	public void buildPillars() {
		System.out.println("high strength concrete wall rods");
		
	}

	@Override
	public void buildWalls() {
		System.out.println("walls are made of glass...shatter proof..bullet proof...solar capable");
	}

}
