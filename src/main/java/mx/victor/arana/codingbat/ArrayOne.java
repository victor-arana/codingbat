package mx.victor.arana.codingbat;

/**
 * @author Administrador
 *
 */
public class ArrayOne {
	

	/**
	 * Given an array of ints, return true if 6 appears as either 
	 * the first or last element in the array. The array will be
	 * length 1 or more. 
	 * @param nums array of ints 
	 * @return true if 6 apperas as either the first or last element in the array
	 */
	public static boolean firstLast6(int[] nums){
		return (nums[0] == 6 || nums[nums.length - 1] == 6);
	}

	/**
	 * Given an array of ints, return true if the array is length 1 or 
	 * more, and the first element and the last element are equal.	 * 
	 * @param nums array of ints
	 * @return true if the array is length 1 or 
	 * more, and the first element and the last element are equal
	 */
	public static boolean sameFirstLast(int[] nums) {
		 if(nums.length > 0){
			 return (nums[0]==nums[nums.length - 1]); 
		 } else{
			 return false;
		 }		 
	}
	
	/**
	 * Return an int array length 3 containing the first 3 digits of pi, {3,1,4}
	 * @return an int array length 3 containing the first 3 digits of pi, {3,1,4}
	 */
	public static int[] makePi(){
		int[] pi = {3,1,4};
		return pi;
	}

	/**
	 * Given 2 arrays of ints, a and b, return true if they have the same first 
	 * element or they have the same last element. Both arrays will be length 1
	 * or more.
	 * @param a an array of ints
	 * @param b an array of ints
	 * @return true if a and b have the same first element or they have the same last
	 * element.
	 */
	public static boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
	}
	
	/**
	 * Given an array of ints length 3, return the sum of all the elements.
	 * @param nums array of ints length 3
	 * @return the sum of all the elements
	 */
	public static int sum3(int[] nums){
		int i = 0;
		int sum = 0;
		for(i = 0; i < nums.length; i++){
			sum = sum + nums[i];
		}
		return sum;
	}
	
	/**
	 * Given an array of ints length 3, return an array with the elements 
	 * "rotated left" so {1, 2, 3} yields {2, 3, 1}
	 * @param nums array of ints
	 * @return array with the elements "rotated left" 
	 */
	public static int[] rotateLeft3(int[] nums){
		int temp = 0;
		
		// Interchange the first and last element
		temp = nums[0];
		nums[0] = nums[2];
		nums[2]	= temp;
		// Interchange the first and middle element		
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
		
		return nums;
	}
	
	/**
	 * Given an array length 3, if there is a 2 in the array immediately 
	 * followed by a 3, set the 3 element to 0. Return the changed array
	 * @param nums array length 3
	 * @return return the changed array
	 */
	public static int[] fix32(int[] nums) {
		if(nums[0] == 2 && nums[1] == 3){
			nums[1] = 0;
		}
		if(nums[1] == 2 && nums[2] == 3){
			nums[2] = 0;
		}
		return nums;
	}
	
	/**
	 * Start with 2 int arrays, a and b, of any length. Return how many of
	 * the arrays have 1 has their first element
	 * @param a An int array
	 * @param b An int array
	 * @return How many of the arrays have 1 as their first element.
	 */
	public static int start1(int[] a, int[] b){

		int counter = 0;
		if(a.length != 0){
			if(a[0]==1){
				counter++;
			}
		}
		if(b.length != 0){
			if(b[0]==1){
				counter++;
			}	
		}	
		return counter;		
	}
	
	/**
	 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values
	 * in each array. Return the array which has the largest sum. In event of a tie,
	 * return a.
	 * @param a An int array
	 * @param b An int Array
	 * @return Return the array which has the largest sum. In event of a tie, return a.
	 */
	public static int[] biggerTwo(int[] a, int[] b){
		int sumArray1 = 0;
		int sumArray2 = 0;
		int[] result;
		for(int i = 0; i < a.length; i++){
			sumArray1 = sumArray1 + a[i];			
		}
		for(int j = 0; j < b.length; j++){
			sumArray2 = sumArray2 + b[j];
		}
		if(sumArray1 == sumArray2){
			result = a;
		}else{
			result = sumArray1 > sumArray2 ? a : b;
		}		
		return result;
	}
	
	/**
	 * Given an array of ints of even length, return a new array length 2
	 * containing the middle two elements from the original array. The original
	 * array will be length 2 or more.
	 * @param nums A array of ints of even length. This array will be length 2 or more.
	 * @return A new array length 2 containing the middle two elements from the original
	 * array. 
	 */
	public int[] makeMiddle(int[] nums){
		int[] result = new int[2];
		int l = nums.length;
		result[0] = nums[l/2 - 1];
		result[1] = nums[l/2];
		return result;
	}
	
	/**
	 * Given an array of ints of odd length, return a new array length 3 containing the
	 * elements from the middle of the array. The array length will be at least 3.
	 * @param nums An array of ints of odd length with at least 3 elements
	 * @return A new array length 3 containing the elements from the middle array
	 */
	public static int[] midThree(int[] nums) {
		int index = nums.length - 1;
		int[] result = new int[3];
		result[0]= nums[index/2 - 1];
		result[1]= nums[index/2];
		result[2]= nums[index/2 + 1];
		return result;
	}
	
	/**
	 * Given an array of ints of odd length, look at the first, last and middle values in
	 * the array and return the largest. The array will be at least 1.
	 * @param nums An arrayy of ints of odd length
	 * @return return the largest.
	 */
	public static int maxTriple(int[] nums) {
		int length = nums.length;
		int first = nums[0];
		int middle = nums[(length - 1)/2];
		int last = nums[length - 1];
		int max = first;
		
		if(middle >= max){
			max =  middle;			
		}
		if(last >= max){
			max = last;
		}
		return max;
	}
	/**
	 * Given an int array of any length, return a new array of its first 2 elements. If the array is
	 * smaller than length 2, use whatever elements are present.	 * 
	 */
	public static int[] frontPiece(int[] nums) {
		int[] result = new int[2];
		if(nums.length < 2){
			return nums;
		}
		result[0] = nums[0];
		result[1] = nums[1];
		return result;
	}		
	
	/**
	 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
	 * @param An array of integers called nums
	 * @return true if the given array contains an unlucky 1 in the first 2 or last 2 positions
	 * in the array.
	 */
	public static boolean unlucky1(int[] nums) {
		if(nums.length >= 2){
			if( (nums[0]==1 && nums[1]==3) || (nums[1]==1 && nums[2]==3) || (nums[nums.length - 2]==1 && nums[nums.length -1]==3)){
				return true;
			}		
			return false;
		} else { return false;
			
		}
	}
	
	/**
	 * Given 2 int arrays, a and b, return a new array of length 2 containing, as much as will fit, the elements
	 * from array a followed by the elements from array b. The arrays may be any length, including 0, but there
	 * will be 2 or more elements available between the 2 arrays.
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[] make2(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0;
		int[] d = new int[2];
		while(i < a.length){
			c[i] = a[i];
			i++;
		}
		while(i < b.length + a.length){
			c[i] = b[i-a.length];
			i++;
		}
		d[0] = c[0];
		d[1] = c[1];
		return d;	
	}
}