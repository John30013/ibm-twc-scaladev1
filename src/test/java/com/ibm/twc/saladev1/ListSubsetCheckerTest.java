package com.ibm.twc.saladev1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ibm.twc.scaladev1.ListSubsetChecker;

public class ListSubsetCheckerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsSubsetOf() {
		// Our "superset": the first 10 Fibonacci numbers.
		int[] first10Fib = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 };
		
		// Validate error handling.
		assertFalse(ListSubsetChecker.isSubsetOf(null, first10Fib));
		assertFalse(ListSubsetChecker.isSubsetOf(new int[] {1, 2, 3}, null));
		
		// Validate logic:
		// Basic subset.
		assertTrue(ListSubsetChecker.isSubsetOf(new int[] {3, 2, 1}, first10Fib));
		// Duplicates don't matter.
		assertTrue(ListSubsetChecker.isSubsetOf(new int[] {3, 2, 1, 1, 2, 3}, first10Fib));
		// Larger set cannot be a subset of smaller set.
		assertFalse(ListSubsetChecker.isSubsetOf(first10Fib, new int[] {1, 2, 3}));
		// Set with unmatched value in superset cannot be a subset.
		assertFalse(ListSubsetChecker.isSubsetOf(new int[] {4, 5, 8}, first10Fib));
	}

}
