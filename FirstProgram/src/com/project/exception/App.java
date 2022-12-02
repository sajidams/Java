package com.project.exception;

public class App {
	
	public static void main(String[] args)
	{
		VoterId id = new VoterId;
		try
		{
			id.rightToVote(19);
		}
		
		catch (VoterIDException e)
		{
			System.out.println(e.getMessage);
		}
	}

}
