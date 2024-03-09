/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int numberOfTests = Integer.parseInt(args[0]);
		int sumOfChildren = 0;
		int amountOf2Children = 0;
		int amountOf3Children = 0;
		int amountOf4Children = 0;


		for (int i = 0; i < numberOfTests; i++) {
			boolean isboy = false;
			boolean isgirl = false;
			int sum = 0;
			
			while (isboy == false || isgirl == false) {
				double rnd = Math.random();
				if (rnd < 0.5){
					isgirl = true;
					// System.out.print("g ");
				} else {
					isboy = true;
					// System.out.print("b ");
				}
				sum = sum + 1;
			}
			// System.out.println();

			sumOfChildren += sum;

			if (sum == 2) {
				amountOf2Children++;
			} else if (sum == 3) {
				amountOf3Children++;
			} else if (sum == 4) {
				amountOf4Children++;
			}
		}
		// System.out.println();
		
		System.out.println("Average: " + ((double)sumOfChildren/numberOfTests) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + amountOf2Children);
		System.out.println("Number of families with 3 children: " + amountOf3Children);
		System.out.println("Number of families with 4 children: " + amountOf4Children);

		if (amountOf2Children >= amountOf3Children && amountOf2Children >= amountOf3Children) {
			System.out.println("The most common number of children is 2 or more.");
		} else if (amountOf3Children >= amountOf2Children && amountOf3Children >= amountOf4Children) {
			System.out.println("The most common number of children is 3 or more.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
