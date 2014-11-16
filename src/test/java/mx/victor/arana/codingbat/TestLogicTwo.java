package mx.victor.arana.codingbat;

import junit.framework.TestCase;

public class TestLogicTwo extends TestCase {
	
	/**
	 * We want to make a row of bricks that is goal inches long. We have a number of 
	 * small bricks (1 inch each) and big bricks (5 inches each). Return true if it is 
	 * possible to make the goal by choosing from the given bricks.
	 */
	public void testmakeBricks(){
		assertEquals(LogicTwo.makeBricks(3,1,8),true);
		assertEquals(LogicTwo.makeBricks(3,1,9),false);
		assertEquals(LogicTwo.makeBricks(3,2,10),true);
	}
}
