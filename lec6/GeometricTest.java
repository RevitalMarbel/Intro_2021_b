package lec6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometricTest {

	@Test
	void testSqrtNegative() {
		if(Geometric.sqrt(-7)!=-1)
			fail("Not yet implemented");
	}
	@Test
	void testSqrtValue() {
		assertEquals(7, Geometric.sqrt(49));
	}
	
	@Test
	void testSqrtValueNot() {
		assertEquals(7, Geometric.sqrt(36));
	}

}
