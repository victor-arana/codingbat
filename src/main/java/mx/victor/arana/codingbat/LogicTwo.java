package mx.victor.arana.codingbat;

public class LogicTwo {

	/**
	 * We want to make a row of bricks that is goal inches long. We have a number of 
	 * small bricks (1 inch each) and big bricks (5 inches each). Return true if it is 
	 * possible to make the goal by choosing from the given bricks.
	 * @param small
	 * @param big
	 * @param goal
	 * @return
	 */
	public static boolean makeBricks(int small, int big, int goal) {
		int lengthBigBricks = big*5;
		int lengthSmallBricks = small;
		int lengthAllBricks = lengthBigBricks + lengthSmallBricks; 
		if(lengthAllBricks == goal){
			return true;
		}else 
		
		return false;
	}
}
