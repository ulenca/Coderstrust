package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Figure;
import main.Trapezoid;

class TrapezoidTest {

	@Test
	void happyPath() {
		Figure trapezoid = new Trapezoid(10,12.5,11);
		assertEquals(123.75, trapezoid.calculateArea());;
	}
	
	@Test
	void negativeRadius() {
		assertThrows(IllegalArgumentException.class, () -> new Trapezoid(-10,1,0));
	}

}
