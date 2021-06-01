package testCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestforTests {

	// assertEquals
	@Test
	void addition() {

		System.out.println(" adding test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1));
	}

	@Test
	void additionButFails() {

		System.out.println(" adding failing test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(2, 1));
	}

	@Test
	public void testReverse() {
		System.out.println(" reverse word test");

		assertEquals("anna", timeTooTest.palindrome("anna"));
	}

	// assertFalse and assertTrue
	@Test
	public void testIfTrue() {
		System.out.println(" a true test");
		// will fail
		// assertTrue(timeTooTest.aNumber("A"));
		// will not fail
		assertTrue(timeTooTest.aNumber("1"));

	}

	public void testIfFalse() {
		System.out.println(" a false test");
		// will fail
		// assertFalse(timeTooTest.aNumber("1"));

		// will not fail
		assertFalse(timeTooTest.aNumber("a"));

	}

	// assertNull and assertNotNull
	@Test
	public void testNull() {
		System.out.println(" is null test");

		// String withStuff = "stuff";

		String withStuff = null;

		assertNull(timeTooTest.isEmpty(withStuff));

	}

	@Test
	public void testNotNull() {
		System.out.println(" is not null test");

		String withStuff = "stuff";

		assertNotNull(timeTooTest.isEmpty(withStuff));
	}

}