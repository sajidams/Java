package com.project.multipleInheritanceUsingInterface;

public class Tester {
	
	public static void main (String[] args)
	{

	Sbi sbi = new Sbi();
	sbi.checkMinimumBalance();
	sbi.deposit();
	sbi.withdraw();
	sbi.generatePin();
	sbi.verifyAadharNumber();
	
	System.out.println("*************************");
	
	CanaraBank canaraBank = new CanaraBank();
	canaraBank.checkMinimumBalance();
	canaraBank.deposit();
	canaraBank.withdraw();
	canaraBank.generatePin();
	canaraBank.verifyAadharNumber();
	
	
	}
}

