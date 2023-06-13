package FlowControl01;
import java.util.Scanner;

public class Question02 {
	static void CheckOddEven(int num) {
		if(num%2==0) 
			System.out.println(num + " is Even");	
		else
			System.out.println(num + " is Odd");
	}
	public static void main(String[] args) {
		
		int num;
		
		//Take the user Input
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number to check if it is Even or odd : ");
			
			// read the tokens one by one and process them
			num = sc.nextInt();
			
			CheckOddEven(num);
			
		}
		finally {
			//Scanner is resource heavy, so close the initialized scanner object
			sc.close();
		}
		
		
		
	}
	
}