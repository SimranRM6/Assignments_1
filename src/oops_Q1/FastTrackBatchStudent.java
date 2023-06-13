package oops_Q1;

public class FastTrackBatchStudent extends Student {
    @Override
    public double calculateFee(String course) {
       
    	switch (course) {
		case "Java":
			return 1000;
		case "Springboot": 
			return 750;
		case "Hibernate":
			return 1200;
		case "React":
			return 1500;
		default:
			System.out.println("Please select a valid course");
			return 0;
		}
    }
}