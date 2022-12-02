package com.project.exception;
// try,catch, throw, throws keywords used
// throw: developer explicitly uses this

public class UnderstandingException {

	int a=4/2; //this gives 2 as output. If it is 4/0, it throws exception.
	// Exception is an event that disturbs the normal execution of the program. 
	// The program stops at where exception is occured
	
	int b=4/0;
	
	try
	
	catch(ArithmeticException)
	{
		System.out.println("Invalid inpput");
	}
	System.out.println(a);
	System.out.println("Next line.............");
	
	
	
}
