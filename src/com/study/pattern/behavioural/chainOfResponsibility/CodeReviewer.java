package com.study.pattern.behavioural.chainOfResponsibility;

public abstract class CodeReviewer {
	
	CodeReviewer superior;

	public void setSuperior(CodeReviewer superior) {
		this.superior = superior;
	}
	
	public abstract void reviewCode(int linesOfCode, boolean isBizLogicChanged);

}
