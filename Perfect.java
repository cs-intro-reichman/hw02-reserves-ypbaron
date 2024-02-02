/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int sum = 0;
		String countstr = "";
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				sum = sum + i;
				if (countstr != ""){
					countstr = countstr + " + ";
				}
				countstr = countstr + i;
			}
		}
		if (sum == x) {
			System.out.print(x + " is a perfect number since " + x + " = " + countstr);
		} else {
			System.out.print(x + " is not a perfect number");
		}
		
	}
}
