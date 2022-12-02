package com.project.exception;
//custom checked exception class
public class VoterIdException extends Exception {
	
	// Override
	public String getMessage()
	{
	return "You are not eligible to vote";
	}

}
