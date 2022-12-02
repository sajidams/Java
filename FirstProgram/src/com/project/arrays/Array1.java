package com.project.arrays;

public class Array1 {

	
	public static void main(String[] args) {
		String[] container = new String[5];
		container[0] = "Sajida";
		container[1] = "12345";
		container[2] = "#$%#@#$";
		container[3] = "12#%#$%";
		container[4] = "Student";
		
		//for iterating the data over a 'For each' loop
		for(String str:container) //str is a local variable created
		{
			System.out.println(str);
		}
	}
}


	