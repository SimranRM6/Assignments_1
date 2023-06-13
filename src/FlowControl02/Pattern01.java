package FlowControl02;

public class Pattern01 {
	static void Pattern(int rows,int columns) {
		for(int j=rows; j>0; j--) {
			for(int i=1;i<=columns;i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//For each row, print 5 columns
	static void Pattern1(int rows, int columns) {
		for(int i=0;i<rows;i++) {
			for(int j=0 ;j<columns;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		int i,j;
//		for(j=3; j>0; j--) {
//			for(i=1;i<=5;i++) {
//				System.out.print("* ");		
//			}
//			System.out.println();
//		}
		
		Pattern(3,5);
		System.out.println();
		Pattern1(3,5);
	}
}