package com.study.pattern.behavioural.chainOfResponsibility;

public class TechArchitect extends CodeReviewer{

	@Override
	public void reviewCode(int linesOfCode, boolean isBizLogicChanged) {
		System.out.println("Code is reviewed by Technical Architect");
	}

}
