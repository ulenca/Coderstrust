package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Figure;
import main.Square;

class SquareTest {

	@Test
	void happyPath() {
		Figure square = new Square(13.5);
		assertEquals(182.25, square.calculateArea());
	}
	
	@Test
	void negativeRadius() {
		assertThrows(IllegalArgumentException.class, () -> new Square(-1));
	}

}
