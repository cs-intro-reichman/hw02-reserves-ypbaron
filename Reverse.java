/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int l = s.length();
		char mid = s.charAt((l - 1) / 2); // find what the problem with mid is?
		
		for (int i = l - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();	
		System.out.println("The middle character is " + mid);
	}
}

