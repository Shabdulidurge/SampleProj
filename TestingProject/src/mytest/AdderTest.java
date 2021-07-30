package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdderTest {

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		int a=100 , b = 200;
		Adder adder  = new Adder();
	int result = 	adder.add(a, b);
		assertEquals(result , 300);
	}
   
}
