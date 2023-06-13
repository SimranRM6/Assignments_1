package FlowControl02;

public class Pattern06 {
	static void Pattern(int rows, int columns) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Pattern(5,5);
		
	}
}