package mx.victor.arana.codingbat;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTwoTest {

	/**
	 * Given two strings, return true if either of the strings appears at the very end of the
	 * other string, ignoring upper/lower case differences.
	 * 
	 */
	@Test
	public void testEndOther() {
		assertEquals(true, StringTwo.endOther("Hiabc", "abc"));
		assertEquals(true, StringTwo.endOther("AbC","HiaBc"));
		assertEquals(true, StringTwo.endOther("abc","abXabc")); 
		assertEquals(false, StringTwo.endOther("Hiabc","abcd"));
	}

}
