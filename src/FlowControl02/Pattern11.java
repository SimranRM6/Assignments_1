package FlowControl02;

public class Pattern11 {
	static void Pattern(int rows) {
		int counter=1;
		for(int i=1; i<=rows; i++) {
			for(int j=i; j>0; j--) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern(7);
	}
}