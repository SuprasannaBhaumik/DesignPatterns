package com.study.pattern.behavioural.strategy;

public class BabyRunStrategyImpl implements CustomStrategy{

	@Override
	public void run() {
		System.out.println("running with baby steps");
	}

}
