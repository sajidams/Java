package com.project.polymorphism;

// This class describes factory operations
public class RunTime {

	
	public void start()
	{
		System.out.println("Factory will start at 9am");
	}
	
	public void manufacture()
	{
		System.out.println("Factory will manufacture different items");
	}
	
	public void shutDown()
	{
		System.out.println("Factory gets shutdown once the production completes");
	}
	
	public void close()
	{
		System.out.println("Factory shuts down at 9pm");
	}
}
