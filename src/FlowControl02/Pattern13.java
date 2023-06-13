package FlowControl02;

public class Pattern13 {
	static void Pattern(int rows) {
		for (int i = 0; i < rows; i++) {
            // Print spaces in decreasing order
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print stars in increasing order
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
	}
    public static void main(String[] args) {
         Pattern(7);
 

        
    }
}