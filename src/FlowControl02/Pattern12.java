package FlowControl02;

public class Pattern12 {
	static void Pattern(int rows) {
		for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
	}
    public static void main(String[] args) {
         Pattern(7);
 

        
    }
}
