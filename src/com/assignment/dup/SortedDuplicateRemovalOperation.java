package com.assignment.dup;

import java.util.Set;
import java.util.TreeSet;

import com.assignment.dup.util.ArrayUtil;

/**
 * This class implements <code>DuplicateRemovalOperation</code> interface. The
 * implementation removes duplicates in an array and keeps them the elements
 * sorted.
 * 
 * @author Makeshkumar Subramaniam
 * 
 */
public class SortedDuplicateRemovalOperation implements DuplicateRemovalOperation {

	/**
	 * Duplicate removal implemenation with sorting.
	 */
	public int[] removeDuplicate(int[] t) {

		int[] temp = null;

		if (t != null) {

			Set<Integer> set = new TreeSet<Integer>();

			/* converting primitive array to a collection */
			ArrayUtil.toCollection(t, set);

			temp = new int[set.size()];

			/* converting collection back to primitive */
			temp = ArrayUtil.toPrimitive(set);

		}

		return temp;
	}

}
