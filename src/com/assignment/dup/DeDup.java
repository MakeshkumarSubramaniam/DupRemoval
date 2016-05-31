package com.assignment.dup;

/**
 * The Facade class
 * 
 * @author Makeshkumar Subramaniam
 * 
 */
public class DeDup {

	private int[] a = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43,
			2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5,
			10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3,
			6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6,
			1, 8, 18, 4, 14, 13, 2, 11 };

	private DuplicateRemovalOperation simpleDuplicateRemovalOperation;

	private DuplicateRemovalOperation orderedDuplicateRemovalOperation;

	private DuplicateRemovalOperation sortedDuplicateRemovalOperation;

	/**
	 * Constructor
	 * 
	 * @param simple
	 * @param ordered
	 * @param sorted
	 */
	public DeDup(DuplicateRemovalOperation simple,
			DuplicateRemovalOperation ordered, DuplicateRemovalOperation sorted) {
		this.simpleDuplicateRemovalOperation = simple;
		this.orderedDuplicateRemovalOperation = ordered;
		this.sortedDuplicateRemovalOperation = sorted;
	}

	/**
	 * UseCase : A simple unordered/sorted duplicate removed array
	 * 
	 * @return
	 */
	public int[] removeDuplicate() {
		return simpleDuplicateRemovalOperation.removeDuplicate(a);
	}

	/**
	 * UseCase : Ordered duplicate removed array
	 * 
	 * @return
	 */
	public int[] removeDuplicateOrdered() {
		return orderedDuplicateRemovalOperation.removeDuplicate(a);
	}

	/**
	 * UseCase : Sorted duplicate removed array
	 * 
	 * @return
	 */
	public int[] removeDuplicateSorted() {
		return sortedDuplicateRemovalOperation.removeDuplicate(a);
	}

	/**
	 * Prints the array
	 * 
	 * @param array
	 */
	private void printArray(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			stringBuilder.append(array[i]
					+ (array.length != (i + 1) ? "," : ""));
		}
		System.out.println(stringBuilder);
	}

	public static void main(String[] args) {

		DuplicateRemovalOperation simpleDupRemOp = new SimpleDuplicateRemovalOperation();
		DuplicateRemovalOperation orderedDupRemOp = new OrderedDuplicateRemovalOperation();
		DuplicateRemovalOperation sortedDupRemOp = new SortedDuplicateRemovalOperation();

		DeDup deDup = new DeDup(simpleDupRemOp, orderedDupRemOp, sortedDupRemOp);

		int[] simpleDupArray = deDup.removeDuplicate();
		int[] orderedDupArray = deDup.removeDuplicateOrdered();
		int[] sortedDupArray = deDup.removeDuplicateSorted();

		deDup.printArray(simpleDupArray);
		deDup.printArray(orderedDupArray);
		deDup.printArray(sortedDupArray);

	}

}
