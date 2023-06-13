package FlowControl02;

public class Pattern10 {
	static void Pattern(int rows, int columns) {
		int ascii=97;
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print((char)(ascii+j) + " ");			
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern(5,6);
		
		
	}
}