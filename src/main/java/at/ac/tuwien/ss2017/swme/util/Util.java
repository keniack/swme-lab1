package at.ac.tuwien.ss2017.swme.util;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.ac.tuwien.ss2017.swme.enums.Color;

public class Util {
	
	private static final Logger log = LoggerFactory.getLogger(Util.class);

	/** The method compares two arrays and return the sum of the arrays. For every positive comparison 1 is sum. For negative comparisons 0 is sum.
	 *  Ex: array 1 : [A,B,C,D] Array 2: [B,A,C,D] -> result Array : [0,0,1,1] sum : 2 ;
	 * 
	 * @param list1
	 * @param list2
	 * @return sum
	 */
	public static int compareArraysAndSum(List<Color> list1, List<Color> list2) {
		int summe = 0;
		if (list1 == null || list1.isEmpty() || list2 == null || list2.isEmpty())
			return summe;
		for (int i = 0; i < list1.size(); i++)
			if (list1.get(i) == list2.get(i))
				summe += 1;
		return summe;
	}
	
	/**
	 * Searchs object in array if it exists return 1 if not return 0 
	 * @param list
	 * @param obj
	 * @return int
	 */
	public static int searchObjInArrays(List<Color> list, Color obj) {
		if (list == null || list.isEmpty() || obj == null)
			return 0;
		for (int i = 0; i < list.size(); i++)
			if (list.contains(obj))
				return 1;
		return 0;
	}

}
