package mx.victor.arana.codingbat;

import junit.framework.TestCase;

public class TestStringOne extends TestCase {
		
	/**
	 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".  
	 */
	public void testhelloName(){
		assertEquals("Hello Bob!", StringOne.helloName("Bob"));
		assertEquals("Hello Alice!", StringOne.helloName("Alice"));
		assertEquals("Hello X!", StringOne.helloName("X"));
	}
	
	/**
	 * Given two strings, a and b, return the result of putting them together in
	 * the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 */
	public void testmakeAbba(){
		assertEquals("HiByeByeHi", StringOne.makeAbba("Hi", "Bye"));
		assertEquals("YoAliceAliceYo", StringOne.makeAbba("Yo", "Alice"));
		assertEquals("WhatUpUpWhat", StringOne.makeAbba("What", "Up"));		
	}
	
	/**
     * Given tag and word strings, create the HTML string with tags around the 
     * word, e.g. "<i>Yay</i>".
	 */
	public void testMakeTags(){
		assertEquals("<i>Yay</i>",StringOne.makeTags("i","Yay"));
	}
	
}
