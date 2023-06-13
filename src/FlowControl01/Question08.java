package FlowControl01;
import java.util.Scanner;

public class Question08 {
	
	static void ColorCode(char code) {
		switch(code) {
		 case 'R' :
			 System.out.println("Color: Red");
			 break;
		 case 'B' :
			 System.out.println("Color: Blue");
			 break;
		 case 'G' :
			 System.out.println("Color: Green");
			 break;
		 case 'Y' :
			 System.out.println("Color: Yellow");
			 break;
		 case 'O' :
			 System.out.println("Color: Orange");
			 break;
		 case 'W' :
			 System.out.println("Color: White");
			 break;
		 default: 
			 System.out.println("Invalid code");
		 
		}
	}
	public static void main(String[] args) {
		
		char code;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Color code (R,B,G,Y,O,W) : ");
			code= sc.next().charAt(0);
			ColorCode(code);
			
		}
		finally {
			sc.close();
		}
		
		
		
	}
	
}