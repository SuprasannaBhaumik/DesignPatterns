package com.study.pattern.creational.singleton;

public class CustomSingleton {
	
	//create an object on the singleton
	private static CustomSingleton singleton;
	
	private static Object mutex = new Object();
	
	//constructor private as this class cannot be instantiated from outside 
	private CustomSingleton() {}
	
	//get the only object create by static method
	//only static variables can be returned via static methods, 
	//hence singleton instance is static
	public static CustomSingleton getSingletonInstance() {
		CustomSingleton instance = singleton; 
		if(instance == null) {
			synchronized (mutex) {
				instance = singleton;
				if (instance == null) {
					instance = singleton =  new CustomSingleton();
				}
			}
		}
		return singleton;
	}
	
	public void sayHello() {
		System.out.println("Hello World!!!");
	}

}
