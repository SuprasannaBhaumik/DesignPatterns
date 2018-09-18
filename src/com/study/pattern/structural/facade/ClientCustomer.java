package com.study.pattern.structural.facade;

public class ClientCustomer {

	public static void main(String[] args) {
		
		Receptionist receptionist = new Receptionist();
		
		VegMenu vegMenu = receptionist.getVegMenu();
		NonVegMenu nonVegMenu = receptionist.getNonVegMenu();
		MixedMenu mixedMenu = receptionist.getMixedMenu();
		
		System.out.println(vegMenu.toString());
		System.out.println(nonVegMenu.toString());
		System.out.println(mixedMenu.toString());
	}

}
