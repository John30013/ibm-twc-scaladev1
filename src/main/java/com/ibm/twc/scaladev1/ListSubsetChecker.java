package com.ibm.twc.scaladev1;

import java.util.HashSet;

public class ListSubsetChecker {

	private ListSubsetChecker() {
		// Do-nothing constructor.
	}
	
	/**
	 * Checks whether the list of integers in the first parameter is a proper 
	 * subset of the list of integers in the second parameter.
	 * NOTES: 
	 *   1) for this exercise I've used arrays of integers, but the logic
	 * 		used could apply to any type of list of any type of value.
	 *   2) the assignment didn't specify whether the lists could contain
	 *      duplicate elements. I've assumed here that they don't (or, rather,
	 *      that duplicate values don't matter). If this assumption were 
	 *      changed, the algorithm would have to change as well.
	 * @param a	An int[] representing the assumed subset.
	 * @param b An int[] representing the assumed superset.
	 * @return <tt>true</tt> if a is a proper subset of b (that is, all of the
	 * 		elements in a are also in b); false if not, or if a or b is null.
	 */
	public static boolean isSubsetOf(int[] a, int[] b) {
		boolean isSubset = true;
		if (null == a || null == b) {
			return false;
		}
		// Note: in a functional language I could use reduce to calculate this.
		// I could also have set the parameters to be ArrayList<Integer> and 
		// used Java's Collection methods (e.g., containsAll()) to test this 
		// in a single line. But I wanted to demonstrate the logic manually.
		HashSet<Integer> setOfB = new HashSet<Integer>(b.length);
		for (int i : b) {
			setOfB.add(Integer.valueOf(i));
		}
		for (int i : a) {
			if (!setOfB.contains(Integer.valueOf(i))) {
				isSubset = false;
				break;
			}
		}
		return isSubset;
	}
}
