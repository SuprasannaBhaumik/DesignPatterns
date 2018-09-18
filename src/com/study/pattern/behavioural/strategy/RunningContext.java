package com.study.pattern.behavioural.strategy;

public class RunningContext {
	
	private CustomStrategy strategy;

	//to be set at runtime
	public void setRunner(CustomStrategy strategy) {
		this.strategy = strategy;
	}
	
	//use the strategy
	public void doRun() {
		strategy.run();
	}

}
