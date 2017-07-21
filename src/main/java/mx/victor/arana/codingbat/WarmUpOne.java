package mx.victor.arana.codingbat;

public class WarmUpOne {

	
	/**
	 * Given a string, take the last char and return a new string with 
	 * the last char added at the front and back, so "cat" yields "tcatt". 
	 * The original string will be length 1 or more.
	 * @param str
	 * @return
	 */
	public static String backAround(String str) {
	  String last = "";
	  if(str.length() >= 1){
	     last = str.substring(str.length()-1);
	  }
	  return last + str + last;
	}

	/**
	 * Given an int n, return the absolute difference between n and 21, 
	 * except return double the absolute difference if n is over 21. 
	 * @param n
	 * @return
	 */
	public static int diff21(int n) {
		int difference = Math.abs(21 - n);

		if(n > 21){
			difference = 2*difference;
		}
		return difference;  
	}

	/**
	 * Given 2 int values, return true if they are both in the range 30..40 
	 * inclusive, or they are both in the range 40..50 inclusive.
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean in3050(int a, int b) {
		if((a >= 30 && a <= 40)&&(b >= 30 && b <= 40))
			return true;
		if((a >= 40 && a <= 50)&&(b >= 40 && b <= 50))
			return true;
		return false;
	}

	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile 
	 * indicate if each is smiling. We are in trouble if they are both smiling 
	 * or if neither of them is smiling. Return true if we are in trouble. 
	 * @param aSmile
	 * @param bSmile
	 * @return
	 */
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;     
	}

	public static String startOz(String str) {
	     String result = "";     
	     if(str.length() > 0 && str.charAt(0)== 'o') result = result + "o";
	     if(str.length() > 1 && str.charAt(1)== 'z') result = result + "z";     
	     return result;
	}

	/**
	 * Given two int values, return their sum. Unless the two values are the same, 
	 * then return double their sum.
	 * @param a
	 * @param b
	 * @return
	 */
	public static int sumDouble(int a, int b) {
		// Store the sum in a local variable
		int sum = a + b;
		if(a == b){
			sum = 2*sum;
		}
		return sum;
	}

	/**
	 * The parameter weekday is true if it is a weekday, and the parameter vacation
	 * is true if we are on vacation. We sleep in if is not a weekday or we're on 
	 * vacation.
	 * @author Victor José Arana Rodríguez
	 * @since 16/11/2014
	 * @param weekday
	 * @param vacation
	 * @return sleep in
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	/**
	 * Given a string name, e.g. "Bob". return a greeting of the form
	 * "Hello Bob!". 
	 *
	 * @param string
	 * @return
	 */
	public static String helloName(String string) {
		return "Hello " + string + "!";
	}

	
	/**
	 * Given two strings, a and b, return the result of putting them together in
	 * the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 * 
	 * @param string
	 * @param string2
	 * @return
	 */
	public static String makeAbba(String a, String b) {
		return a+b+b+a;
	}	

}
