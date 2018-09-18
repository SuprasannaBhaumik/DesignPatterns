package com.study.pattern.behavioural.strategy;

public class RunningApplication {

	public static void main(String[] args) {
		
		CustomStrategy runningStrategy = new AtheleteRunStrategyImpl();
		
		RunningContext context = new RunningContext();
		context.setRunner(runningStrategy);
		context.doRun();
		
	}

}
