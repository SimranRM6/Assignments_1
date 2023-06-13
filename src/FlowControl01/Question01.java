package FlowControl01;
import java.util.Scanner;

public class Question01 {
	static void CheckNum(int n) {
		if(n>0) 
			System.out.println(n + " is Positive");
		else if(n<0)
			System.out.println(n + " is Negative");
		else
			System.out.println(n + " is 0");
				
	}
	
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Please enter a number to be checked : ");
			
			num= sc.nextInt();
			
			CheckNum(num);
			
		} 
		
		finally {
			
			sc.close();
		}
		
			
	}
	
	
}