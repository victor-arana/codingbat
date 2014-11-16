package mx.victor.arana.codingbat;

import junit.framework.TestCase;

public class TestArrayOne extends TestCase {
	
	public void testmake2(){
		int[] testMatrix1 = {4,5};
		int[] testMatrix2 = {1,2,3};
		int[] expectedMatrix = {4,5};
		int[] resultMatrix = ArrayOne.make2(testMatrix1, testMatrix2);
		
		assertEquals(2,resultMatrix.length);
		
		for(int i = 0; i < 2; i++){
			assertEquals(expectedMatrix[i], resultMatrix[i]);
		}		
	}
}
