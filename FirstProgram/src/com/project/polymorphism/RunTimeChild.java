package com.project.polymorphism;

public class RunTimeChild extends RunTime {

	public void start() {
		System.out.println("Sugar Factory will start at 6am");
	}

	public void manufacture() {
		System.out
				.println("Sugar Factory will manufacture Sugar and Sugar Cane");
	}

	public void shutDown() {
		System.out
				.println("SugarFactory gets shutdown once the production completes");
	}

	public void close() {
		System.out.println("Sugar Factory shuts down at 6pm");
	}
}
