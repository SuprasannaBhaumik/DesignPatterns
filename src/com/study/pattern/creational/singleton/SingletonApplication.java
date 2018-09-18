package com.study.pattern.creational.singleton;

//  The singleton design pattern is a creational design pattern,
//  which makes sure that you have one single instance of a particular class in the duration of your runtime,
//  and provides a global point of access to the single instance.
public class SingletonApplication {

	public static void main(String[] args) {
		//not possible to instantiate a singleton,
		//as the constructor is private
		//CustomSingleton singleton = new CustomSingleton();
		
		//get the only object available
		CustomSingleton singleton = CustomSingleton.getSingletonInstance();
		System.out.println(singleton.hashCode());
		
		
		CustomSingleton singleton1 = CustomSingleton.getSingletonInstance();
		System.out.println(singleton1.hashCode());
		
		//singleton.sayHello();

	}

}
