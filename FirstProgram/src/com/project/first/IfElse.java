package com.project.first;

public class IfElse {
	public static void main(String[] args)
	{
		boolean hasAadharCard=true;
		boolean hasPanCard=true;
		boolean hasVoterID=false;
		if(hasAadharCard)
		{
			System.out.println("Has Aadharcard");
		}
		else if (hasPanCard)
		{
			System.out.println("Has Pan card");
			
		}
		else if (hasVoterID)
		{
			System.out.println("Has Voter Id");
			
		}
		else
		{
			System.out.println("Not Indian");
				
			
		}
		
	}
}
