package com.MarygraceProject.model;
//name of the package for file; all files in packages will have save declaration. Must be included

//for classes you use outside your packages
import com.MarygraceProject.tony.Tony;

//class declaration; the blueprint for an object or an instance
//3 main parts: data members, constructors and methods.
public class Marygrace {

	private int numberOfPets; // This is a data field or data member. It's a primitive data type: int or
								// integer.
								// Typically data fields are private as we want to limit outsiders from
								// handling sensitive information.

	// Typically fields are defined without values in a class so that they may
	// be defined by objects when initialized
	// Also anything that is declared w/o public or private is defaulted to public
	// but its better
	// to write out public since its readable

	private String bestPersonEver;
	// String object is a higher level obj in java
	// I believe its an Array with of chars
	// Strings are immutable which means the value cannot change

	private static int marygraceObjectsCreated = 0;
	// static variables are those that belong to the class
	// so every object created will have the same value for this

	private static final String OBJECT_NAME = "Marygrace";
	// final means that the object can't change. We dont want
	// to alter your name after field is created. Also name
	// remains same for each object; thus its static. CAPS and UNDERSCORE FOR BEST
	// PRACTIVE

	private String[] eddySuiteMembers = new String[10];
	// This is an array of Strings; Arrays are lower level
	// and must be declared with total number of values
	// dealing with arrays are annoying because what
	// if we have more than 10? well thats a problem
	// for another day

	// ----------------------------------------------------------------------------------------

	// constructors- they are how we build objects. An empty parameter constructor
	// is the default and not required;

	// this is our empty constructor
	public Marygrace() {
		// in here we're gonna set our fields
		this.numberOfPets = 1; // this keyword used for current objects data fields
		this.bestPersonEver = "Luke";
		Marygrace.marygraceObjectsCreated++; // since static field belongs to
		eddySuiteMembers[0] = "Marygrace";
		eddySuiteMembers[1] = "Luke";
		eddySuiteMembers[2] = "James"; // you get the idea, up to 9 we can use

		Tony.hello();
	}

	// Here we can have a constructor with multiple params
	// special type of comment for documentation

	/**
	 * Constructor for Marygrace class.
	 * 
	 * @param numberOfPets
	 *            number of pets marygrace owns
	 * @param bestPersonEver
	 *            the best person ever in type string
	 */
	public Marygrace(int numberOfPets, String bestPersonEver) {
		this.numberOfPets = numberOfPets; 		
		// we can set the parameters passed to be our data members											
		// only use this if param is same name
		//this keyword can be used on fields, methods, constructors to 
		//use what is defined in the class
		
		this.bestPersonEver = bestPersonEver;
		Marygrace.marygraceObjectsCreated++;
		eddySuiteMembers[0] = "Marygrace";
		eddySuiteMembers[1] = "Luke";
		eddySuiteMembers[2] = "James"; // you get the idea, up to 9 we can use

	}

	public Marygrace(int numberOfPets, String bestPersonEver, String[] suiteMembers) {
		this.numberOfPets = numberOfPets; // we can just set our parameter vars to be our data members
		this.bestPersonEver = bestPersonEver;
		Marygrace.marygraceObjectsCreated++;
		eddySuiteMembers = suiteMembers; 
		
		// a problem that could break our app is if someone passes
		// an array >10. Your're right thats bad practice which
		// is why arrays don't get used in the real world much
	}

	// -------------------------------------------------------------------------------------------
	// Methods - functions for the class - same as you know them in any other
	// language

	// setup is public/private (visibility) | datatype | method name |
	// ([parameters])

	// Here we only are using getters and setters - getting a data field or setting
	// a data field (accessors and mutators)
	// they are public because we want outside classes (or should i say marygrace
	// objects) to call them in order to work with our privates
	

	// In a model package, model classes usually only have getters/setters because
	// they represent
	// a real world entity - hence why they are called models. However i have also
	// included a
	// useless delegate method to show you another example

	public int getNumberOfPets() {
		return numberOfPets;
	}

	public void setNumberOfPets(int numberOfPets) {
		this.numberOfPets = numberOfPets;
	}

	public String getBestPersonEver() {
		return bestPersonEver;
	}

	public void setBestPersonEver(String bestPersonEver) {
		this.bestPersonEver = bestPersonEver;
	}

	public static int getMarygraceObjectsCreated() { // ill talk about static methods in the util class
		return marygraceObjectsCreated;
	}

	public static String getName() {
		return OBJECT_NAME;
	}

	public String[] getEddySuiteMembers() {
		return eddySuiteMembers;
	}

	// heres our dumb useless delegate method. its a delegate because its calling
	// the string
	// method to do all the work. the delegate is the string class. a little
	// confusing i know, i
	// dont know how much better to explain. However in a model class theres a
	// chance you could see
	// a simple delegate class like this if this value is important to the model
	// (like if this
	// return value would get sent to a database)
	public int compareTo(String anotherString) {
		return bestPersonEver.compareTo(anotherString); // calling strings compareTo even
														// though our's is compareTo
		// returns 0 if both vals are equal and pos/neg number based on which string
		// has a greater lexical value. yea its useless
	}

}
