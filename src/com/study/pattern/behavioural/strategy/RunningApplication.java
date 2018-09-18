package com.study.pattern.behavioural.strategy;


//  The Strategy pattern is a behavioral design pattern,
//  that allows you to decide which course of action a program should take, 
//  based on a specific context during runtime. 
//  You encapsulate two different algorithms inside two classes, 
//  and decide at runtime which strategy you want to go with.
public class RunningApplication {

	public static void main(String[] args) {
		
		CustomStrategy runningStrategy = new AtheleteRunStrategyImpl();
		//CustomStrategy runningStrategy = new BabyRunStrategyImpl();
		
		RunningContext context = new RunningContext();
		context.setRunner(runningStrategy);
		context.doRun();
		
	}

}
