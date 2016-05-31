package com.assignment.dup;

import java.util.LinkedHashSet;
import java.util.Set;

import com.assignment.dup.util.ArrayUtil;

/**
 * This class implements <code>DuplicateRemovalOperation</code> interface. The
 * implementation removes duplicates in an array and keeps the order intact.
 * 
 * @author Makeshkumar Subramaniam
 * 
 */
public class OrderedDuplicateRemovalOperation implements DuplicateRemovalOperation {

	/**
	 * Duplicate removal implemenation keeps the insertion order.
	 */
	public int[] removeDuplicate(int[] t) {

		int[] temp = null;

		if (t != null) {

			Set<Integer> set = new LinkedHashSet<Integer>(1);

			/* converting primitive array to a collection */
			ArrayUtil.toCollection(t, set);

			temp = new int[set.size()];

			/* converting collection back to primitive */
			temp = ArrayUtil.toPrimitive(set);

		}

		return temp;
	}

}
