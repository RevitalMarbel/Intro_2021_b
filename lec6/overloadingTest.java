package lec6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class overloadingTest {

	@Test
	void testSum() {
		if(overloading.sum(0)!=0)
			fail("Not yet implemented");
		assertEquals(20, overloading.sum(5,5,5,5), overloading.sum(5,5,5,5)+"not equals 20");
		
	}
	@Test
	void testSum1() {
		assertEquals(21, overloading.sum(5,5,5,5), overloading.sum(5,5,5,5)+"not equals 21");
		
	}

}
