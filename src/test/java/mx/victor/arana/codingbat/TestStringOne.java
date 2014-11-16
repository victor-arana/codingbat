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
	
	public void testmakeAbba(){
		assertEquals("HiByeByeHi", StringOne.makeAbba("Hi", "Bye"));
		assertEquals("YoAliceAliceYo", StringOne.makeAbba("Yo", "Alice"));
		assertEquals("WhatUpUpWhat", StringOne.makeAbba("What", "Up"));		
	}
	
}
