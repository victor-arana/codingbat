package mx.victor.arana.codingbat;

import junit.framework.TestCase;

/**
 * @author Victor
 *
 */
public class TestLogicOne extends TestCase {

	/** 
	 * You and your date are trying to get a table at a restaurant. 
	 * The parameter "you" is the stylishness of your clothes, in the 
	 * range 0..10, and "date" is the stylishness of your date's clothes. 
	 * The result getting the table is encoded as an int value with 0=no, 
	 * 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then 
	 * the result is 2 (yes). With the exception that if either of you has 
	 * style of 2 or less, then the result is 0 (no). Otherwise the result 
	 * is 1 (maybe). 
	 */
	public void testDateFashion() {
		assertEquals(2, LogicOne.dateFashion(5, 10));
		assertEquals(0, LogicOne.dateFashion(5, 2));
		assertEquals(1, LogicOne.dateFashion(5, 5));			
	}
	
	/**
	 * The squirrels in Palo Alto spend most of the day playing. In particular, 
	 * they play if the temperature is between 60 and 90 (inclusive). Unless it is 
	 * summer, then the upper limit is 100 instead of 90. Given an int temperature 
	 * and a boolean isSummer, return true if the squirrels play and false otherwise. 
	 */
	public void testSquirrelPlay(){
		assertEquals(true,LogicOne.squirrelPlay(70,false));
		assertEquals(false, LogicOne.squirrelPlay(95,false));
		assertEquals(true,LogicOne.squirrelPlay(95,true));
	}
	
	/**
	 * You are driving a little too fast, and a police officer stops you. Write code to compute 
	 * the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 
	 * 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
	 * If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed 
	 * can be 5 higher in all cases.
	 */
	public void testcaughtSpeeding() {
		assertEquals(0,LogicOne.caughtSpeeding(60,false));
		assertEquals(1,LogicOne.caughtSpeeding(65,false));
		assertEquals(0,LogicOne.caughtSpeeding(65,true));
	}
	
	/**
	 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
	 * are forbidden, so in that case just return 20
	 */
	public void testsortaSum(){
		assertEquals(7,LogicOne.sortaSum(3,4));
		assertEquals(20,LogicOne.sortaSum(9,4));
		assertEquals(21,LogicOne.sortaSum(10,11));		
	}
	
	/**
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean 
	 * indicating if we are on vacation, return a string of the form "7:00" indicating 
	 * when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the 
	 * weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should 
	 * be "10:00" and weekends it should be "off"
	 */
	public void testalarmClock() {
		assertEquals("7:00", LogicOne.alarmClock(1,false));
		assertEquals("7:00", LogicOne.alarmClock(5,false));
		assertEquals("10:00", LogicOne.alarmClock(0,false));
	}
		
	
	/**
	 * The number 6 is a truly great number. Given two int values, a and b, return true 
	 * if either one is 6. Or if their sum or difference is 6. Note: the function 
	 * Math.abs(num) computes the absolute value of a number.  
	 */
	public void testlove6(){
		assertEquals(true, LogicOne.love6(6,4));
		assertEquals(false, LogicOne.love6(4,5));
		assertEquals(true, LogicOne.love6(1,5));
	}
	
	/**
	 * Given a number n, return true if n is in the range 1..10, inclusive. Unless
	 * "outsideMode" is true, in which case return true if the number is less
	 * or equal to 1, or greater or equal to 10
	 */
	public void testin1To10(){
		assertEquals(true, LogicOne.in1To10(5,false));
		assertEquals(false, LogicOne.in1To10(11,false));
		assertEquals(true, LogicOne.in1To10(11,true));
	}
	
	/**
	 * We'll say a number is special if it is a multiple of 11 or if it is one more than
	 * a multiple of 11. Return true if the given non-negative number is special.
	 */
	public void testspecialEleven(){	
		assertEquals(true,LogicOne.specialEleven(22));
		assertEquals(true,LogicOne.specialEleven(23));
		assertEquals(false,LogicOne.specialEleven(24));
		
	}
		
/**
	 * Return true if the given non-negative number is 1 or more than a multiple of 20.
	 */
	public void testmore20(){
		assertEquals(false,LogicOne.more20(20));
		assertEquals(true,LogicOne.more20(21));
		assertEquals(true,LogicOne.more20(22));
	}
	
	/**
	 * Return true if the given non-negative
	 */
	public void testold35(){
		assertEquals(true, LogicOne.old35(3));
		assertEquals(true, LogicOne.old35(10));
		assertEquals(false, LogicOne.old35(15));
	}
	
	/**
	 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
	 */
	public void testless20(){
		assertEquals(true, LogicOne.less20(18));
		assertEquals(true, LogicOne.less20(19));
		assertEquals(false, LogicOne.less20(20));
	}
	
	/**
	 * Given a non-negative number "num", return true if num is within 2 of a 
	 * multiple of 10.
	 */
	public void testnearTen(){
		assertEquals(true, LogicOne.nearTen(12));
		assertEquals(false, LogicOne.nearTen(17));
		assertEquals(true, LogicOne.nearTen(19));
	}
	
	public void testTenSum() {
		assertEquals(7, LogicOne.tenSum(3,4));
		assertEquals(19, LogicOne.tenSum(10,13));
		assertEquals(19, LogicOne.tenSum(13,2));
	}
	
	/**
	 * Your cell phone rings. Return true if you should answer it. Normally you answer, 
	 * except in the morning you only answer if it is your mom calling. In all cases, if 
	 * you are asleep, you do not answer.
	 */
	public void testanswerCell(){
		boolean isMorning = false;
		boolean isMom = false;
		boolean isAsleep = false;		
		assertEquals(true, LogicOne.answerCell(isMorning,isMom,isAsleep));
		assertEquals(false, LogicOne.answerCell(false,false,true));
		assertEquals(true, LogicOne.answerCell(false,true,false));
		assertEquals(false, LogicOne.answerCell(false,true,true));
		assertEquals(false, LogicOne.answerCell(true,false,false));
		assertEquals(false, LogicOne.answerCell(true,false,true));
		assertEquals(true, LogicOne.answerCell(true,true,false));
		assertEquals(false, LogicOne.answerCell(true,true,true));
	}
	
	/**
	 * We are having a party with amounts of tea and candy. Return the int outcome of the 
	 * party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy 
	 * are at least 5. However, if either tea or candy is at least double the amount of the 
	 * other one, the party is great (2). However, in all cases, if either tea or candy is 
	 * less than 5, the party is always bad (0). 
	 */
	public void testteaParty(){
		// Bad = 0
		// If either tea or candy is less than 5
		assertEquals(0,LogicOne.teaParty(1,1));
		assertEquals(0,LogicOne.teaParty(1,5));
		assertEquals(0,LogicOne.teaParty(5,1));
		
		// Good = 1
		// Both tea and candy are at least 5
		assertEquals(1,LogicOne.teaParty(5,5));		
		assertEquals(1,LogicOne.teaParty(6,6));
		assertEquals(1,LogicOne.teaParty(6,5));
		assertEquals(1,LogicOne.teaParty(5,6));
		
		// Great = 2
		// Either tea or candy is at least double the amount of the other one
		assertEquals(2,LogicOne.teaParty(5,10));
		assertEquals(2,LogicOne.teaParty(10,5));		
	}
	
	/**
	 * Given a string str, if the string starts with "f" return "Fizz". If the string
	 * ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return
	 * "FizzBuzz". In all other cases, return the string unchanged.
	 */
	public void testfizzString() {
		assertEquals("Fizz", LogicOne.fizzString("fig"));
		assertEquals("Buzz",LogicOne.fizzString("dib"));
		assertEquals("FizzBuzz", LogicOne.fizzString("fib"));
		
	}	
	
	/**
	 * Given an int n, return the string form of the number followed by "!". So the int
	 * 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the 
	 * number, and if the number is divisible by 5 use "Buzz", and if divisible by both
	 * 3 and 5, use "FizzBuzz".   
	 */
	public void testfizzString2(){
		assertEquals("1!", LogicOne.fizzString2(1));
		assertEquals("Fizz!",LogicOne.fizzString2(3));
		assertEquals("Buzz!", LogicOne.fizzString2(5));
		assertEquals("FizzBuzz!", LogicOne.fizzString2(15));		
	}
	
	/**
	 * Given three ints, a b c, return true if it is possible to add two of the ints
	 * to get the third.
	 */
	public void testtwoAsOne(){
		assertEquals(true, LogicOne.twoAsOne(1,2,3));
		assertEquals(true, LogicOne.twoAsOne(3,1,2));
		assertEquals(false, LogicOne.twoAsOne(3,2,2));
	}
	
	
	/**
	 * Given three ints, a b c, return true if b is greater than a, and c is 
	 * greater than b. However, with the exception that if "bOk" is true, b does
	 * not need to be greater than a.
	 * @param a
	 * @param b
	 * @param c
	 * @param bOk
	 * @return
	 */
	public void testinOrder(){
		assertEquals(true, LogicOne.inOrder(1,2,4,false));
		assertEquals(false, LogicOne.inOrder(1,2,1,false));
		assertEquals(true, LogicOne.inOrder(1,1,2,true));
	}
	
	/**
	 * Given three ints, a b c, return true if they are in strict increasing order, 
	 * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception 
	 * that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
	 * @param an int a
	 * @param an int b
	 * @param an int c
	 * @param equalOk if "equalOk" is true, equality is allowed
	 * @return
	 */	
	public void inOrderEqual(){
		assertEquals(true,LogicOne.inOrderEqual(2,5,11,false));
		assertEquals(false,LogicOne.inOrderEqual(5,7,6,false));
		assertEquals(true,LogicOne.inOrderEqual(5,5,7,true));
	}
	
	/**
	 * Given three ints, a b c, return true if two or more of them have the same 
	 * rightmost digit. The ints are non-negative. Note: the % "mod" operator 
	 * computes the remainder, e.g. 17 % 10 is 7. 
	 */
	public void testlastDigit(){
		assertEquals(true, LogicOne.lastDigit(23, 19, 13));
		assertEquals(false, LogicOne.lastDigit(23, 19, 12));
		assertEquals(true, LogicOne.lastDigit(23, 19, 3));		
	}
	
	/**
	 * Given three ints, a b c, return true if one of them is 10 or more less than 
	 * one of the others.
	 */
	public void testlessBy10(){
		assertEquals(true,LogicOne.lessBy10(1, 7, 11));
		assertEquals(false,LogicOne.lessBy10(1, 7, 10));
		assertEquals(true,LogicOne.lessBy10(11, 1, 7));
	}
	
	public void testwithoutDoubles(){
		assertEquals(5, LogicOne.withoutDoubles(2,3,true));
		assertEquals(7, LogicOne.withoutDoubles(3,3,true));
		assertEquals(6, LogicOne.withoutDoubles(3,3,false));
	}

	/**
	 * Given two int values, return whichever value is larger. However if the two values have 
	 * the same remainder when divided by 5, then the return the smaller value. However, in all 
	 * cases, if the two values are the same, return 0. Note: the % "mod" operator computes 
	 * the remainder, e.g. 7 % 5 is 2
	 */
	public void testmaxMod5(){
		assertEquals(3, LogicOne.maxMod5(2,3));
		assertEquals(6, LogicOne.maxMod5(6,2));
		assertEquals(3, LogicOne.maxMod5(3,2));
	}
	
	/**
	 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they 
	 * are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. 
	 * Otherwise so long as both b and c are different from a, the result is 1. 
	 * Otherwise the result is 0.
	 */
	public void testredTicket(){
		assertEquals(10,LogicOne.redTicket(2,2,2));
		assertEquals(0,LogicOne.redTicket(2,2,1));
		assertEquals(5,LogicOne.redTicket(0,0,0));
	}
	
	/**
	 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different 
	 * from each other, the result is 0. If all of the numbers are the same, the result is 20. If two 
	 * of the numbers are the same, the result is 10.
	 */
	
	public void testgreenTicket(){
		assertEquals(0,LogicOne.greenTicket(1,2,3));
		assertEquals(20,LogicOne.greenTicket(2,2,2));
		assertEquals(10,LogicOne.greenTicket(1,1,2));		
	}
	
	/**
	 * You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll 
	 * call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to 
	 * exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, 
	 * the result is 5. Otherwise the result is 0.
	 */
	public void testblueTicket(){
		assertEquals(10, LogicOne.blueTicket(9,1,0));
		assertEquals(0, LogicOne.blueTicket(9,2,0));
		assertEquals(10, LogicOne.blueTicket(6,1,4));
	}
	
	/**
	 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both 
	 * numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while 
	 * the % "mod" n%10 gives the right digit.) 
	 */
	public void testsharedDigit(){
		assertEquals(LogicOne.sharedDigit(12,23),true);
		assertEquals(LogicOne.sharedDigit(12,43),false);
		assertEquals(LogicOne.sharedDigit(12,44),false);
	}
	
	/**
	 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same
	 * number of digits as a. If the sum has more digits than a, just return a without b. 
	 * (Note: one way to compute the number of digits of a non-negative int n is to convert 
	 * it to a string with String.valueOf(n) and then check the length of the string.) 
	 * 
	 */
	public void testsumLimit(){
		assertEquals(LogicOne.sumLimit(2,3),5);
		assertEquals(LogicOne.sumLimit(8,3),8);
		assertEquals(LogicOne.sumLimit(8,1),9);
	}
}