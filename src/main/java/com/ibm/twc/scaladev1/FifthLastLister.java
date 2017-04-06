package com.ibm.twc.scaladev1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class FifthLastLister {

	// Note: Java LinkedLists are doubly-linked, but I'm using only forward 
	// traversal in the logic below.
	LinkedList<Integer> list = null;
	
	public FifthLastLister() {
		// TODO Auto-generated constructor stub
	} // do-nothing constructor.

	/**
	 * Returns the 5th element from the end of the passed in LinkedList of 
	 * Integers. 
	 * @param list	A LinkedList of Integers.
	 * @return the 5th element from the end of the list, or <tt>null</tt> if 
	 * 		the list is null or contains fewer than 5 elements.
	 */
	public static Integer listIt(LinkedList<Integer> list) {
		Deque<Integer> stack = new LinkedList<Integer>();
		Integer fifthLast = null;
		
		if (null != list) {
			// Traverse the list and reverse it by pushing each element onto 
			// the stack.
			for (Integer i : list) {
				stack.push(i);
			}
			// Try to pop 5 elements from the stack, keeping the 5th.
			try {
				for (int i = 0; i < 5; i++) {
					fifthLast = stack.pop();
				}
			}
			catch (NoSuchElementException nsee) {
				fifthLast = null;
			}
		} // end of block to ensure list is not null.
		return fifthLast;
	} // end of listIt().
} // end of FifthLastLister class.
