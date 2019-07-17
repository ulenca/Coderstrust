package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Figure;
import main.Rectangle;

class RectangleTest {

	@Test
	void happyPath() {
		Figure rectangle = new Rectangle(13.5,6);
		assertEquals(81, rectangle.calculateArea());
	}
	
	@Test
	void negativeRadius() {
		assertThrows(IllegalArgumentException.class, () -> new Rectangle(10,-1));
	}

}
