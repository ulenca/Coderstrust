package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Figure;
import main.Triangle;

class TriangleTest {

	@Test
	void happyPath() {
		Figure triangle = new Triangle(13.5,6);
		assertEquals(40.5, triangle.calculateArea());;
	}
	
	@Test
	void negativeRadius() {
		assertThrows(IllegalArgumentException.class, () -> new Triangle(10,-1));
	}

}
