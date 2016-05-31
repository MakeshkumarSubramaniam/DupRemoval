package com.assignment.dup;

import java.util.HashSet;
import java.util.Set;

import com.assignment.dup.util.ArrayUtil;

/**
 * This class implements <code>DuplicateRemovalOperation</code> interface. The
 * implementation removes duplicates in an array.
 * 
 * @author Makeshkumar Subramaniam
 * 
 */
public class SimpleDuplicateRemovalOperation implements DuplicateRemovalOperation {

	/**
	 * A simple duplicate removal implemenation.
	 */
	public int[] removeDuplicate(int[] array) {

		int[] temp = null;

		if (array != null) {

			Set<Integer> set = new HashSet<Integer>(1);

			/* converting primitive array to a collection */
			ArrayUtil.toCollection(array, set);

			temp = new int[set.size()];

			/* converting collection back to primitive */
			temp = ArrayUtil.toPrimitive(set);

		}

		return temp;
	}

}
