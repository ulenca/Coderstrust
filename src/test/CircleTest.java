package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Circle;
import main.Figure;

class CircleTest {

	
	@Test
	void happyPath() {
		Figure circle = new Circle(10);
		assertEquals(314, Math.round(circle.calculateArea()));;
	}
	
	@Test
	void negativeRadius() {
		assertThrows(IllegalArgumentException.class, () -> new Circle(-10));
	}

}
