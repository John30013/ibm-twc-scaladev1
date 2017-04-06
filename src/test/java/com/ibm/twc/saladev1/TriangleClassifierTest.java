package com.ibm.twc.saladev1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ibm.twc.scaladev1.TriangleClassifier;
import com.ibm.twc.scaladev1.TriangleClassifier.TRIANGLE_TYPE;

public class TriangleClassifierTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testClassify() {
		// Validate error handling.
		try {
			TriangleClassifier.classify(-1.0, 0, 1.0);
		}
		catch (Exception ex) {
			assertTrue(ex instanceof IllegalArgumentException);
		}
		
		// Validate logic.
		assertEquals(TRIANGLE_TYPE.EQUILATERAL, TriangleClassifier.classify(3.5, 3.5, 3.5));
		assertEquals(TRIANGLE_TYPE.ISOSCELES, TriangleClassifier.classify(3, 4, 3));
		assertEquals(TRIANGLE_TYPE.SCALENE, TriangleClassifier.classify(5, 12, 13));
	}

}
