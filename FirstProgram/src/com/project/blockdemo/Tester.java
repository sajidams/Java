package com.project.blockdemo;

public class Tester {
 
	public static void main(String[] args)
	{
		Bag bag = new Bag();
		System.out.println(bag.name);
		System.out.println(bag.price);
		System.out.println(bag.brand);
		
		
		//Static variable we can access directly using class name, no need to create object
		System.out.println(Bag.model);
		
	}
	
	
}
