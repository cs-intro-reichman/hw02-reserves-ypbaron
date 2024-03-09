
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean isboy = false;
		boolean isgirl = false;
		int sum = 0;
		
		while (isboy == false || isgirl == false) {
			double r = Math.random();
			if (r < 0.5){
				isgirl = true;
				System.out.print("g ");
			} else {
				isboy = true;
				System.out.print("b ");
			}
			sum = sum + 1;
		}

	}
}
