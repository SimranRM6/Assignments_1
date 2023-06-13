package FlowControl02;

public class Pattern02 {
	
	static void Pattern(int rows) {
		for(int i=rows; i>0 ; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern(5);
	}
}