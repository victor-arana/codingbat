package mx.victor.arana.codingbat;

import junit.framework.TestCase;

public class TestWarmUpOne extends TestCase {
	/**
	 * Given a string, take the last char and return a new string 
	 * with the last char added at the front and back, so "cat" yields 
	 * "tcatt". The original string will be length 1 or more.
	 */
	public void testbackAround(){
		assertEquals("tcatt", WarmUpOne.backAround("cat"));
		assertEquals("oHelloo", WarmUpOne.backAround("Hello"));
		assertEquals("aaa", WarmUpOne.backAround("a"));
	}	
	
	/**
	 * Given an int n, return the absolute difference between n and 21, 
	 * except return double the absolute difference if n is over 21 
	 */
	public void testdiff21(){
		assertEquals(2, WarmUpOne.diff21(19));
		assertEquals(11, WarmUpOne.diff21(10));
		assertEquals(0, WarmUpOne.diff21(21));
	}
	
	/**
	 * Given 2 int values, return true if they are both in the range 30..40 inclusive, 
	 * or they are both in the range 40..50 inclusive. 
	 */
	public void testin3050(){
		assertEquals(true, WarmUpOne.in3050(30,31));
		assertEquals(false, WarmUpOne.in3050(30,41));
		assertEquals(true, WarmUpOne.in3050(40,50));
	}
	
	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile 
	 * indicate if each is smiling. We are in trouble if they are both smiling 
	 * or if neither of them is smiling. Return true if we are in trouble.
	 */
	public void testmonkeyTrouble(){
		assertEquals(true,WarmUpOne.monkeyTrouble(true,true));
		assertEquals(true,WarmUpOne.monkeyTrouble(false,false));
		assertEquals(false,WarmUpOne.monkeyTrouble(true,false));
	}
	
	/**
	 * 	Given a string, return a string made of the first 2 chars (if present), 
	 *  however include first char only if it is 'o' and include the second only 
	 *  if it is 'z', so "ozymandias" yields "oz". 
	 */
	public void teststartOz(){
		assertEquals("oz", WarmUpOne.startOz("ozymandias"));
		assertEquals("z", WarmUpOne.startOz("bzoo"));
		assertEquals("o", WarmUpOne.startOz("oxx"));				
	}
	
	/**
	 * Given two int values, return their sum. Unless the two values are the 
	 * same, then return double their sum.
	 */
	public void testsumDouble(){
		assertEquals(3,WarmUpOne.sumDouble(1,2));
		assertEquals(5,WarmUpOne.sumDouble(3,2));
		assertEquals(8,WarmUpOne.sumDouble(2,2));
	}
			
}
