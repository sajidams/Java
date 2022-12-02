package com.project.superandfinal;

public class PowerBank {
	int slNo;
	static final int CAPACITY = 1500; // final is used to declare constants
	static int duplicateCapacity;
	public void modifyPowerBankDetails()
	{
		this.slNo=1;
		duplicateCapacity=CAPACITY;
		
		duplicateCapacity++;
		System.out.println("SlNo: "+slNo);
		System.out.println("CAPACITY: "+CAPACITY);
		System.out.println("duplicateCapacity: "+duplicateCapacity);
		
	}
}
