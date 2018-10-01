package com.study.pattern.behavioural.chainOfResponsibility;

public class Developer extends CodeReviewer{

	@Override
	public void reviewCode(int linesOfCode, boolean isBizLogicChanged) {
		if(linesOfCode < 750  && !isBizLogicChanged) {
			System.out.println("Code is reviewed by Developer");
		} else {
			superior.reviewCode(linesOfCode, isBizLogicChanged);
		}
	}

}
