package com.ibm.twc.saladev1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import com.ibm.twc.scaladev1.FifthLastLister;

public class FifthLastListerTest {

	/*
	 * Helper method to create a LinkedList<Integer> from an array of integers.
	 */
	private LinkedList<Integer> makeList(int[] list) {
		LinkedList<Integer> theList = new LinkedList<Integer>();
		for (int i = 0; i < list.length; i++) {
			theList.add(list[i]);
		}
		return theList;
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testListIt() {
		// Validate error handling.
		assertNull(FifthLastLister.listIt(null));
		assertNull(FifthLastLister.listIt(makeList(new int[]{1, 2, 3})));
		
		// Validate logic.
		assertEquals(Integer.valueOf(3), FifthLastLister.listIt(makeList(new int[] { 1, 2, 3, 4, 5, 6, 7})));
	}
}
