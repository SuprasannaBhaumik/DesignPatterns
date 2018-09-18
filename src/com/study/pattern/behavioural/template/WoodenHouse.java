package com.study.pattern.behavioural.template;

public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildFoundation() {
		System.out.println("Foundation made with iron rods, etc");
	}

	@Override
	public void buildPillars() {
		System.out.println("pillars made of bamboo wood");
	}

	@Override
	public void buildWalls() {
		System.out.println("Walls made of high density medium framewood");
	}

}
