package com.project.polymorphism;

public class TestCompileTime {
	
	public static void main(String[] args)
	{
		
		CompileTime compileTime = new CompileTime();
		compileTime.searchUser(12345);
		compileTime.searchUser(99999999999l);
		compileTime.searchUser("Sajida");
		compileTime.searchUser("Sajida", "Shaikh", "Hubli");
	}

}
