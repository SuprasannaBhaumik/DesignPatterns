package com.study.pattern.behavioural.chainOfResponsibility;

public class TechnicalLead extends CodeReviewer {

	@Override
	public void reviewCode(int linesOfCode, boolean isBizLogicChanged) {
		if(linesOfCode > 1500 && !isBizLogicChanged) {
			System.out.println("Code is reviewed by Senior Developer");
		} else {
			superior.reviewCode(linesOfCode, isBizLogicChanged);
		}
	}

}
