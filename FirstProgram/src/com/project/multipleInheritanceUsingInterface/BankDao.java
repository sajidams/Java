package com.project.multipleInheritanceUsingInterface;

// Infosys has an API called Finacle for its banking purpose.
//Oracle has fluxcube

// Project is specific to the client Ex: sbi app
// Product is not specific to the client, Ex: SAAS, windows OS, 
public interface BankDao { //Dao - Data access Object
	
	void withdraw();
	void checkMinimumBalance();
	void generatePin();
	void deposit();
	void verifyAadharNumber();
}
