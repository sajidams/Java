package com.project.polymorphism;

public class TestRunTime {

	public static void main(String[] args)
	{
		RunTime runTime = new RunTime();
		runTime.start();
		runTime.manufacture();
		runTime.shutDown();
		runTime.close();

		System.out.println("**********************************");

		RunTimeChild runTimeChild = new RunTimeChild();
		runTimeChild.start();
		runTimeChild.manufacture();
		runTimeChild.shutDown();
		runTimeChild.close();

		System.out.println("**********************************");

		RunTime runTime1 = new RunTimeChild();
		runTime1.start();
		runTime1.manufacture();
		runTime1.shutDown();
		runTime1.close();

		
		Demo demo = new Demo();
		demo.eat();
		demo.sleep();
		System.out.println("Overrided hashCode method value is: " + demo.hashCode());
		
	}


	
	

}
