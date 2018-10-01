package com.study.pattern.behavioural.chainOfResponsibility;

public class SeniorDeveloper extends CodeReviewer {

	@Override
	public void reviewCode(int linesOfCode, boolean isBizLogicChanged) {
		if(linesOfCode > 750 && linesOfCode < 1500 && !isBizLogicChanged) {
			System.out.println("Code is reviewed by Senior Developer");
		} else {
			superior.reviewCode(linesOfCode, isBizLogicChanged);
		}
	}

}
