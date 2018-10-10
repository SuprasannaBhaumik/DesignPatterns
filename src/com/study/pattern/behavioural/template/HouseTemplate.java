package com.study.pattern.behavioural.template;

public abstract class HouseTemplate {
	
	//  Template method, final so subclasses can't override.
	//  Here we have provided the steps,
	//  but each step can be implemented in a different way, 
	//  or there can be a default implementation.
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	public abstract void buildFoundation();
	public abstract void buildPillars();
	public abstract void buildWalls();
	
	//default implementation
	private void buildWindows() {
		System.out.println("Windows are of make Saint Gobain!!!");
	};

}
