package io.turntabl.springwebservices;

import io.turntabl.springwebservices.Controller.Maths;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringWebServicesApplicationTests {

	@Test
	void testAdd() {
		Maths maths = new Maths();
		Integer actual = maths.add(1,3);
		Integer expected = 4;
		assertEquals(expected,actual);
	}

	@Test
	void testSubtract() {
		Maths maths = new Maths();
		Integer actual = maths.subtract(3,2);
		Integer expected = 1;
		assertEquals(expected,actual);
	}

}
