package com.project.abstraction;

public class Tester {

	public static void main (String[] args)
	{
		//We can not create object for Abstract class
		
		Honda honda = new Honda();
		honda.engine();
		honda.body();
		honda.price();
		honda.wheel();
		
		System.out.println("*************************");
		
		Mrf mrf = new Mrf();
		mrf.engine();
		mrf.body();
		mrf.price();
		mrf.wheel();
		
	}
}
