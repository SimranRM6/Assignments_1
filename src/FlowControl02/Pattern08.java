package FlowControl02;

public class Pattern08 {
	static void Pattern(int rows, int columns) {
		int counter=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				System.out.print(counter + " ");
				counter=counter+2;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern(5,5);
		
		
	}
}