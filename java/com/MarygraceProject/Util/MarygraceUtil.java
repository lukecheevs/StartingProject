package com.MarygraceProject.Util;

import java.util.Objects;

import com.MarygraceProject.model.Marygrace;

//Our Util class is a utility for handling marygrace objects
//kinda unnecessary if you wanna put methods inside model but we
//want to break up our classes so its all more business like

//final, because it's not supposed to be subclassed (a topic for another day)
public final class MarygraceUtil {

	// typically only includes functions in a util class
	// gonna use the default constructor

	// ----------------------------------------------------------------------
	// these are all just generic methods with no purpose
	// typically static because they belong to the class. The Util doesn't need to
	// be defined
	// as an object because its always the same instance

	// since we are comparing multiple marge objects we should exclude this function
	// from marge model for better representation
	// cannot use private fields in static classes
	public static boolean compareMarygraceObjectsHaveSamePetNumber(Marygrace marge1, Marygrace marge2) {
		System.out.println();
		return marge1.getNumberOfPets() == marge2.getNumberOfPets();
	}

	// void because we're not returning anything
	public static void switchBestPersonEverNames(Marygrace marge1, Marygrace marge2) {
		String temp = marge1.getBestPersonEver();
		marge1.setBestPersonEver(marge2.getBestPersonEver());
		marge2.setBestPersonEver(temp);
	}

	public static boolean compare(Marygrace marge1, Marygrace marge2) {
		// protect from null

		return Objects.nonNull(marge1.getBestPersonEver())
				? marge1.getBestPersonEver().equalsIgnoreCase(marge2.getBestPersonEver())
				: Objects.isNull(marge2.getBestPersonEver());
	}
}
