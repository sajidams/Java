package com.project.exception;

public class VoterId {
	
	public void rightToVote(int age) throws VoterIdException 
	//throws we have to use if this method is throwing exceptions
	{

	if(age<18)
		throw new VoterIdException();
	else
		System.out.println("You can vote");
	}
}
