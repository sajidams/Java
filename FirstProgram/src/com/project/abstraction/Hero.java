package com.project.abstraction;
//Parent class
public abstract class Hero {
	
	public void engine() 
	/*this is called concrete methos : method thats is implemented in abstract class, 
	it can not be overridden by child class*/
	{
		System.out.println("Engine is developed by Hero company");
	}
	
	abstract void body(); //we can declare the abstract method in the abstract class
	abstract void wheel();
	abstract void price();
	

}
