package com.study.pattern.behavioural.chainOfResponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		
		Developer d = new Developer();
		SeniorDeveloper sd = new SeniorDeveloper();
		TechnicalLead tl = new TechnicalLead();
		TechArchitect ta = new TechArchitect();
		
		d.setSuperior(sd);
		sd.setSuperior(tl);
		tl.setSuperior(ta);
		
		d.reviewCode(300, true);

	}

}
