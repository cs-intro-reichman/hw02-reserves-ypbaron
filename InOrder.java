/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {		
	int previous = -1;

        do {
            int num = (int) (Math.random() * 11); 

            if (num > previous) {
                System.out.print(num + " ");
                previous = num;
            } else {
                break; 
            }

        } while (previous < 10);
    }
}


