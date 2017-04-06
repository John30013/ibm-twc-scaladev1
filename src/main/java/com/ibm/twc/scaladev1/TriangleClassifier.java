package com.ibm.twc.scaladev1;

public class TriangleClassifier {
	public enum TRIANGLE_TYPE {
		SCALENE, ISOSCELES, EQUILATERAL
	}

	private TriangleClassifier() {
		super();
		// Do-nothing constructor.
	} // end of do-nothing constructor.

	/**
	 * Classifies a triangle by comparing the lengths of its sides. Note that 
	 * this method does not attempt to validate whether the lengths given can
	 * form a valid triangle (other than making sure they're all positive
	 * values).
	 * 
	 * @param a A double indicating the length of side a.
	 * @param b A double indicating the length of side b.
	 * @param c A double indicating the length of side c.
	 * @return	The TRIANGLE_TYPE enumeration value indicating the type of 
	 * 		triangle represented by the given side lengths.
	 * @throws IllegalArgumentException if any parameter is not a positive value.
	 */
	public static TRIANGLE_TYPE classify(double a, double b, double c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new IllegalArgumentException("All three side lengths must be greater than 0.");
		}
		if (a == b && b == c && c == a) {
			return TRIANGLE_TYPE.EQUILATERAL;
		}
		if (a == b || b == c || c == a) {
			return TRIANGLE_TYPE.ISOSCELES;
		}
		return TRIANGLE_TYPE.SCALENE;
	} // end of classify().
} // end of TriangleClassifier class.
