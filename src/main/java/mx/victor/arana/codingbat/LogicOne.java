package mx.victor.arana.codingbat;

public class LogicOne {

	/**
	 * You and your date are trying to get a table at a restaurant. If either
	 * of you is very stylish, 8 or more, then the result is 2(yes). With the 
	 * exception that if either of you has style of 2 or less, then 
	 * the result is 0(no). Otherwise the result is 1 (maybe) 
	 * @param you The stylishness of your clothes, in the range 0..10
	 * @param date The stylishness of your date's clothes
	 * @return 0 = no, 1 = maybe.
	 */
	public static int dateFashion(int you, int date) {
		if(you <= 2 || date <= 2){
			return 0;
		}else if(you >= 8 || date >= 8){
			return 2;
		}else{
			return 1;
		}
	}

	/**
	 * The squirrels in Palo Alto spend most of the day playing. In particular, they 
	 * play if the temperature is between 60 and 90 (inclusive). Unless it is summer, 
	 * then the upper limit is 100 instead of 90. Given an int temperature and a boolean 
	 * isSummer, return true if the squirrels play and false otherwise. 
	 * @param temp
	 * @param isSummer
	 * @return
	 */
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if(temp >= 60 ){
			if(temp <= 100){
				if(isSummer){
					return true;
				} else if(temp <= 90){
					return true;					
				}	
			}
		}
		return false;
	}
	
	/**
	 * You are driving a little too fast, and a police officer stops you. Write code to compute 
	 * the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 
	 * 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
	 * If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed 
	 * can be 5 higher in all cases.
	 * @param speed
	 * @param isBirthday
	 * @return
	 */
	public static int caughtSpeeding(int speed, boolean isBirthday) {
		int result = 0;
		if(isBirthday){
			speed = speed - 5;
		}
		if(speed <= 60) result = 0;
		if(speed >= 61 && speed <= 80) result = 1;
		if(speed >= 81) result = 2;		
		return result;
	}

	/**
	 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
	 * are forbidden, so in that case just return 20
	 * @param a
	 * @param b
	 * @return
	 */
	public static int sortaSum(int a, int b) {
		int sum = 0;
		sum = a + b;
		if(sum >= 10 && sum <= 19) sum = 20;		
		return sum;
	}

	/**
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean 
	 * indicating if we are on vacation, return a string of the form "7:00" indicating 
	 * when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the 
	 * weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should 
	 * be "10:00" and weekends it should be "off"
	 * @param day
	 * @param vacation
	 * @return
	 */
	public static String alarmClock(int day, boolean vacation) {
		
		boolean weekday = true;
		boolean weekend = !weekday;
		String result = "";
		
		if( day == 0 || day == 6 ){
			weekend = true;
			weekday = !weekend;
		}
		
		if( weekday && !vacation) result = "7:00";
		if( weekend && !vacation) result = "10:00";
		if( weekday && vacation) result = "10:00";
		if( weekend && vacation) result = "off";
		
		return result;
	}

	/**
	 * The number 6  is a truly great number. Given two int values, a and b,
	 * return true if either one is 6. Or if their sum or difference is 6.
	 * Note: the function Math.abs(num) computes the absolute value of a 
	 * number.
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean love6(int a, int b) {
		int sum = a + b;
		int diff = Math.abs(a-b);
		return (a==6||b==6||sum==6||diff==6);
	}

	/**
	 * Given a number n, return true if n is in the range 1..10, inclusive.
	 * Unless "outsideMode" is true, in which case return true if the number
	 * is less or equal to 1, or greater or equal to 10.
	 * @param n
	 * @param outsideMode
	 * @return
	 */
	public static boolean in1To10(int n, boolean outsideMode) {
		if(n==1||n==10) return true;
		return ( n > 1 && n < 10 ) ? !outsideMode : outsideMode;		
	}

	/**
	 * We'll say a number is special if it is a multiple of 11 or if it is one
	 * more than a multiple of 11. 
	 * @param i
	 * @return Return true if the given non-negative number is special
	 */
	public static boolean specialEleven(int i) {
		return ( i % 11 == 0|| (i-1) % 11 == 0 );
	}

	public static boolean more20(int n) {		
		return (((n-1) % 20 == 0) || ((n-2) % 20 == 0));
	}

	/**
	 * Return true if the given non-negative number is a multiple of 3
	 * or 5, but not both.
	 * @param n
	 * @return
	 */
	public static boolean old35(int n) {
		boolean mult3 = (n % 3 == 0);
		boolean mult5 = (n % 5 == 0);
		return (mult3 ^ mult5);
	}

	/**
	 * Return true if the given non-negative number is 1 or 2 less than
	 * a multiple of 20
	 * @param n
	 * @return true if n is 1 or 2 less than a multiple of 20
	 */
	public static boolean less20(int n) {
		return ((n+1) % 20 == 0) || ((n+2) % 20 == 0);
	}

	/**
	 * Given a non-negative number "num", return true if num
	 * is within 2 of a multiple of 10
	 * @param m
	 * @return true if num is within 2 of a multiple of 10
	 */
	public static boolean nearTen(int num) {
		boolean result = false;
		for(int i = -2; i <= 2; i++){
			result = result || (num + i) % 10 == 0;
		}
		return result;
	}
	
	/**
	 * Given 2 ints, a and b, return their sum, However, "teen" values
	 * in the range 13..19 inclusive, are extra lucky. So if either value
	 * is a teen, just return 19.
	 * @param a
	 * @param b
	 * @return
	 */
	public static int tenSum(int a, int b) {
		int initRange = 13;
		int finalRange = 19;
		boolean extraLucky = false;
		
		int sum = a + b;
		for(int i = initRange; i <= finalRange; i++){
			extraLucky = extraLucky || (a == i || b == i);
		}
		if(extraLucky){sum = 19;}
		
		return sum;
	}

	/**
	 * Your cell phone rings. Return true if you should answer it. Normally you answer, 
	 * except in the morning you only answer if it is your mom calling. In all cases, 
	 * if you are asleep, you do not answer.
	 * @param isMorning
	 * @param isMom
	 * @param isAsleep
	 * @return true if you should answer
	 */
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		return ((!isMorning)&&(!isAsleep))||(isMom&&(!isAsleep));		
	}

	/**
	 * We are having a party with amounts of tea and candy. Return the int outcome of the 
	 * party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy 
	 * are at least 5. However, if either tea or candy is at least double the amount of the 
	 * other one, the party is great (2). However, in all cases, if either tea or candy is 
	 * less than 5, the party is always bad (0). 
	 * @param tea amount of tea
	 * @param candy amount of candy
	 * @return 0 = bad, 1 = good, 2 = great
	 */
	public static int teaParty(int tea, int candy) {
		int result = 0;
		if(tea < 5 || candy < 5){
			result = 0;
		}else if(tea >= 5 && candy >= 5){
			result = 1;
			if(tea >= 2*candy || candy >= 2*tea){
				result = 2;
			}
		}
		return result;
	}

	/**
	 * Given a string str, if the string starts with "f" return "Fizz". If the string ends 
	 * with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". 
	 * In all other cases, return the string unchanged. 
	 * @param str
	 * @return
	 */
	public static String fizzString(String str) {
		
//		String result = "";
//		if(str.startsWith("f"))
//			result = "Fizz";
//		if(str.endsWith("b"))
//			result = result + "Buzz";
//		if(result == "")
//			return str;
//		return result;
		
		boolean f = str.startsWith("f");
		boolean b = str.endsWith("b");
		if(f && b)
			return "FizzBuzz";
		if(f)
			return "Fizz";
		if(b)
			return "Buzz";
		return str;		
	}

	/**
	 * Given an int n, return the string form of the number followed by "!". So the int
	 * 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the 
	 * number, and if the number is divisible by 5 use "Buzz", and if divisible by both
	 * 3 and 5, use "FizzBuzz".   
	 * @param n
	 * @return
	 */
	public static String fizzString2(int n) {
		boolean t = n%3 == 0;
		boolean f = n%5 == 0;
		if(t&&f)
			return "FizzBuzz!";
		if(t)
			return "Fizz!";
		if(f)
			return "Buzz!";
		
		return Integer.toString(n) + "!";
	}

	/**
	 * Given three ints, a b c, return true if it is possible to add two of the ints
	 * to get the third
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean twoAsOne(int a, int b, int c) {
		boolean result = false;
		result = (a + b == c) || (c + a == b) || (b + c == a);
		return result;
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
	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if(c > b){
			if(!bOk){
				if(b>a){
					return true;
				} else{
					return false;
				}
			} else{
				return true;
			}
		} else{
			return false;
		}
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
	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		return equalOk ? (b >= a &&  c >= b) : (b > a &&  c > b);
	}

	/**
	 * Given three ints, a b c, return true if two or more of them have the same 
	 * rightmost digit. The ints are non-negative. Note: the % "mod" operator 
	 * computes the remainder, e.g. 17 % 10 is 7. 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean lastDigit(int a, int b, int c) {		
		return a%10 == b%10 || a%10 == c%10 || b%10 == c%10;
	}

	/**
	 * Given three ints, a b c, return true if one of them is 10 or more less than 
	 * one of the others.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean lessBy10(int a, int b, int c) {
		return Math.abs(a-b) >= 10 || Math.abs(b-c) >= 10 || Math.abs(a-c) >= 10;
	}

	/**
	 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if 
	 * noDoubles is true, if the two dice show the same value, increment one die to the 
	 * next value, wrapping around to 1 if its value was 6. 
	 * @param die1
	 * @param die2
	 * @param noDoubles
	 * @return
	 */
	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if(noDoubles && (die1 == die2)){
			die1 = (die1 == 6) ? 1 : die1 + 1; 
		}		
		return die1 + die2;
	}

	/**
	 * Given two int values, return whichever value is larger. However if the two values have 
	 * the same remainder when divided by 5, then the return the smaller value. However, in all 
	 * cases, if the two values are the same, return 0. Note: the % "mod" operator computes 
	 * the remainder, e.g. 7 % 5 is 2
	 * @param a
	 * @param b
	 * @return
	 */
	public static int maxMod5(int a, int b) {
		// Computes the min and max
		int min = a;
		int max = b;
		if(a >= b ){
			max = a;
			min = b;
		}
		if(a == b){
			return 0;
		} else if( a%5 == b%5){
			return min;
		} else{
			return max;
		}		
	}

	/**
	 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they 
	 * are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. 
	 * Otherwise so long as both b and c are different from a, the result is 1. 
	 * Otherwise the result is 0.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int redTicket(int a, int b, int c) {
		int result = 0;
			if(a==2 && b == 2 && c==2){
				result = 10;
			}else if(a==b && b==c){
				result = 5;
			}else if(a!=b && c!= a){
				result = 1;
			}else{
				result = 0;
			}
		return result;
	}

	/**
	 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different 
	 * from each other, the result is 0. If all of the numbers are the same, the result is 20. If two 
	 * of the numbers are the same, the result is 10.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int greenTicket(int a, int b, int c) {
		int result = -1;
		if(a==b && b==c){
			result = 20;
		}else if(a==b || b==c || a==c ){
			result = 10;
		}else{
			result = 0;
		}
		return result;
	}

	/**
	 * You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll 
	 * call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to 
	 * exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, 
	 * the result is 5. Otherwise the result is 0.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int blueTicket(int a, int b, int c) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;
		boolean cond1 = (ab == 10)||(bc == 10)||(ac == 10);
		boolean cond2 = (ab - bc)==10||(ab - ac)==10;
		
		if(cond1){
			return 10;
		} else if(cond2){
			return 5;
		} else{
			return 0;
		}
	}

	/**
	 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both 
	 * numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while 
	 * the % "mod" n%10 gives the right digit.)
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean sharedDigit(int a, int b) {
		int a1 = a/10;
		int a2 = a%10;
		int b1 = b/10;
		int b2 = b%10;
		if(a1 == b1 || a1 == b2){
			return true;
		}else if(a2 == b1 || a2 == b2){
			return true;
		}else if(b1 == a1 || b1 == a2){
			return true;
		}else if(b2 == a1 || b2 == a2){
			return true;
		}else return false;		
	}

	/**
	 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same
	 * number of digits as a. If the sum has more digits than a, just return a without b. 
	 * (Note: one way to compute the number of digits of a non-negative int n is to convert 
	 * it to a string with String.valueOf(n) and then check the length of the string.) 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int sumLimit(int a, int b) {
		int digitsSum = String.valueOf(a + b).length();
		int digitsA = String.valueOf(a).length();
		if(digitsSum == digitsA){
			return a+b;
		}else {
			return a;
		}
	}

	/**
	 * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another
	 * of the values, it does not count towards the sum.
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int loneSum(int a, int b, int c) {
		int sum = a + b + c;
		if(a == b && a == c){
			sum = 0;
		} else if(a == b){
			sum = sum - 2*a;
		} else if(a == c || b == c){
			sum = sum - 2*c;
		}		
		return sum;
	}	
}