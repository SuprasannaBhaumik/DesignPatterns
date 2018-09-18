package com.study.pattern.behavioural.template;

//  In template design pattern we provide a template which cannot be hacked, 
//  but the inner implementations can change.
public class HousingClient {

	public static void main(String s[]) {
		
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		
		System.out.println("====================");
		
		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();
	}
	
	
}
