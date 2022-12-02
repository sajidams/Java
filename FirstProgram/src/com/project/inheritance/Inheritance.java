package com.project.inheritance;

public class Inheritance {

	public static void main(String[] args) {

		System.out.println("Government Organizations:");

		System.out.println("Single inheritance: 1st child class");
		College college = new College();
		college.name = "BVB";
		college.contactNumber = 999999999;
		college.location = "Hubli";

		college.orgDetails();
		System.out.println("**********************************");

		System.out.println("Multilevel inheritance: 2nd child class");
		Library library = new Library();
		library.name = "BVB Library";
		library.contactNumber = 777777777;
		library.location = "Near the Mechanical department";
		library.orgDetails();
		System.out.println("**********************************");

		System.out.println("Hierarchical inheritance: 2nd child class");
		Hospital hospital = new Hospital();
		hospital.name = "KMC";
		hospital.contactNumber = 66666666;
		hospital.location = "Vidyanagar, Hubli";
		hospital.orgDetails();
		System.out.println("**********************************");
	}
}
