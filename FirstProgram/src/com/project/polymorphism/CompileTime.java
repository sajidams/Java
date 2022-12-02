package com.project.polymorphism;

public class CompileTime {
	
	public void searchUser(int userId)
	{
		System.out.println("Search for user Id:"+userId);
		}
	
	public void searchUser(String name)
	{
		System.out.println("Search for user name:"+name);
		}
	
	public void searchUser(long contactNumber)
	{
		System.out.println("Search for contact number:"+contactNumber);
		}
	
	public void searchUser(String fName, String lName, String location)
	{
		System.out.println("Search for full name and location:"+fName +" " +lName +" " +location);
		}
	
}
