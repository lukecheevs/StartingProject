package com.MarygraceProject;

import com.MarygraceProject.Model.Marygrace;
import com.MarygraceProject.Util.MarygraceUtil;

//This will be our class for running the app
//usually not very big and contains a main method
public class App {

	public static void main(String[] args) {
		
		Marygrace firstMarge = new Marygrace();  //this is our default constructor being used to create
												//a marygrace object
		
		int pets = 10;
		String bestPersonName = "Marygrace";
		Marygrace secondMarge = new Marygrace(pets, bestPersonName); //our second marge using other constructor
																		//make sure names are in second order
		
		System.out.println("Your two Marge's have been created");  //print line for java
																	//calls system class
		System.out.println("Their names are: " + Marygrace.getName());  //static methods belong to class
		System.out.println("Number of Marygrace objs created is " + Marygrace.getMarygraceObjectsCreated());
	
		boolean doMarygraceObjectsHaveSamePetNum = MarygraceUtil.compareMarygraceObjectsHaveSamePetNumber
													(firstMarge, secondMarge);
		if(doMarygraceObjectsHaveSamePetNum)
			System.out.println("Marge objects have the same number of pets");
		else 
			System.out.println("Marge1 has " + firstMarge.getNumberOfPets() +
								" while Marge2 has " + secondMarge.getNumberOfPets() + " pets");
		
		//lets swap the names for objects
		System.out.println("BestPersonNames are " + firstMarge.getBestPersonEver() + " for marge1 and " +
				secondMarge.getBestPersonEver() + " for marge2");
		
		MarygraceUtil.switchBestPersonEverNames(firstMarge, secondMarge);
		//please note that this is not pass by reference and is pass by value. The objects themselves are
		//are pointers to specified objects in main. We can modify their values but not where they point
		//For this method, a new firstMarge gets created inside the method call, referenced by the one
		//in this method.
		
		//So for simple data types like int, if i were to pass 2 integer values to swap, the referenced
		//values inside main would never get swapped. We cannot change where simple datatypes
		//point toHowever, in this instance we are modifying the object
		//and not where they point to, so we will have the names swapped. 
		
		//ie i can't do inside this method secondMarge = firstMarge. that wont work
		//however i can change their datamembers.
		
		//this is confusing i get it but for simplicity sake, you can modify objects in methods, but
		//not where they point to. For simple types like, char and int, you cannot modify their
		//values without return a value.
		
		System.out.println("BestPersonNames are now " + firstMarge.getBestPersonEver() + " for marge1 and " +
							secondMarge.getBestPersonEver() + " for marge2");
		
	}
	
}
