package com.project.arrays;

/*Arrays is a not-primitive data type.
 It is a container which holds many values of same type, by using s single variable.
 Array is represented by []
 */
public class Arrays {
	public static void main(String[] args) {
		int[] container = new int[5]; // creation of array
		/*
		// while declaring only, we have to mention the array size.Here 5 is the
		// array size.
		container[0] = 25;
		container[1] = 30;
		container[2] = 35;
		container[3] = 40;
		container[4] = 45;
		//container[5] = 45;// if you add values beyond size it will throw ArrayOutOFIndex Exception
//compiler wont tell anything. at run time this exception will be thrown.
		/*
		 * System.out.println(container[0]); System.out.println(container[1]);
		 * System.out.println(container[2]); System.out.println(container[3]);
		 * System.out.println(container[4]);
		 */
		/*
		 * This printing can be done using for loop
		
		for (int i = 0; i < 5; i++) {
			System.out.println(container[i]);
		}
		
		*/
		
		try
		{
		container[0] = 25;
		container[1] = 30;
		container[2] = 35;
		container[3] = 40;
		container[4] = 45;
		//container[5] = 45;// if you add values beyond size it will throw ArrayOutOFIndex Exception
//compiler wont tell anything. at run time this exception will be thrown.
		/*
		 * System.out.println(container[0]); System.out.println(container[1]);
		 * System.out.println(container[2]); System.out.println(container[3]);
		 * System.out.println(container[4]);
		 */
		/*
		 * This printing can be done using for loop
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println(container[i]);
		}
		}
		catch(ArrayOurOfIndex)
		System.out.println("Please check Array size");
		
	}

}
