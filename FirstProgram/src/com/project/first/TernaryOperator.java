package com.project.first;

public class TernaryOperator {
	public static void main(String[] args)
	{
		boolean result=(10<20)?true:false;
		String name="Bangalore";
		String result1=name.equals("Bangalore")?"Capital city of Karnataka":"Invalid input";
		System.out.println("The value of result is:"+result);
		System.out.println("The city is: "+result1);
	}
}
