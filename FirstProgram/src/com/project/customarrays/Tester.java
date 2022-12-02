package com.project.customarrays;

public class Tester {
	
	public static void main(String[] args)
	{
		
		School school = new School(1, "St.Joseph", "Bangalore",92843091248);
		School school1 = new School(2, "St.Martha", "Mysore",888888888);
		School school2= new School(3, "St.John", "Tumkur",777777777777);
		School school3= new School(4, "St.Merry", "Raichur",666666666);
		
		
		
		School[] collection = new School[4]; //Array object is created for custom class
		collection[0]=school;
		collection[1]=school1;
		collection[2]=school2;
		collection[3]=school3;
		
		//by using 'For Each' loop
		
		for(School scl:collection)
			System.out.println(scl);
		
		
	}
	

}
