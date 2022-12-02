package com.project.blockdemo;
/*blocks: 1. Static block
		  2. Instance block 
		
		  We can initialize the value for instance properties inside the instance class
		  *
		  *
		  */


public class Bag {
	
	String name; //Static varible initialization is done at class level only
	double price;
	String brand;
	
	static String model = "Fast track";
	
	//instance block
	{
		//instance initialization block.
		//Here we can initialize static variables also
		name = "College bag";
		price = 1500;
		brand ="Wild craft";
		model = "mild craft";
	}
	
	//static initialization block. Only static variables we can use in static 
	static {
		model ="Wild craft";
	}
	

}
