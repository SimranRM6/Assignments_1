package FlowControl02;

public class Pattern07 {
	static void Pattern(int rows, int columns) {
		for(int i=1;i<=rows;i++) {
			for(int j=i*10-9;j<=i*10;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	static void PatternCounter(int rows,int columns) {
		int counter=1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		PatternCounter(5,10);
		System.out.println();
		Pattern(6,10);
		
	}
}