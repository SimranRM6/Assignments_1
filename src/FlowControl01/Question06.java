package FlowControl01;

public class Question06 {
	
	public static void main(String[] args) {
		
		//Check if the command line has 2 arguments one for Gender and other for age
		 if (args.length != 2) {
	            System.out.println("Invalid number of command line arguments.");
	            return;
	        }
		 
		 //get the gender and age from the command line arguments
		 String gender = args[0];
	     int age = Integer.parseInt(args[1]);
	     
	
	     //Check if gender and age has expected values
	     if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) {
	            System.out.println("Invalid gender.");
	            return;
	        }
	     if (age < 1 || age > 120) {
	    	 System.out.println("Invalid age.");
	         return;
	     }

	     double interestRate;

	     switch (gender) {
	         case "Female":
	                if (age >= 1 && age <= 58) {
	                    interestRate = 8.2;
	                } else if (age >= 59 && age <= 120) {
	                    interestRate = 7.6;
	                } else {
	                    interestRate = 0.0;
	                }
	                break;
	          case "Male":
	                if (age >= 1 && age <= 60) {
	                    interestRate = 9.2;
	                } else if (age >= 61 && age <= 120) {
	                    interestRate = 8.3;
	                } else {
	                    interestRate = 0.0;
	                }
	                break;
	          default:
	                interestRate = 0.0;
	        }
	     System.out.println("Interest Rate: " + interestRate + "%");
		
	}
}