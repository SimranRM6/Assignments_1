package oops_Q1;

public class WeekendBatchStudent extends Student {
    @Override
public double calculateFee(String course) {
        
    	switch (course) {
		case "Java":
			return 900;
		case "Springboot": 
			return 800;
		case "Hibernate":
			return 1300;
		case "React":
			return 1500;
		default:
			System.out.println("Please select a valid course");
			return 0;
		}
    }
}
