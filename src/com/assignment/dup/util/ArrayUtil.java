package com.assignment.dup.util;

import java.util.Collection;

/**
 * Utility class for array and collection conversion, manipulation
 * 
 * @author Makeshkumar Subramanim
 * 
 */
public class ArrayUtil {

	/*
	 * Private constructor
	 */
	private ArrayUtil() {
	}

	/**
	 * Converts collection into an primitive int array
	 * 
	 * @param collection
	 * @return
	 */
	public static int[] toPrimitive(Collection<Integer> collection) {

		int[] temp = new int[collection.size()];
		int i = 0;
		for (Integer val : collection) {
			temp[i++] = val;
		}
		return temp;

	}

	/**
	 * Converts a primitive int array into a collection
	 * 
	 * @param array
	 * @param collection
	 * @return
	 */
	public static Collection<Integer> toCollection(int[] array,
			Collection<Integer> collection) {

		for (int val : array) {
			collection.add(val);
		}
		return collection;

	}

}
