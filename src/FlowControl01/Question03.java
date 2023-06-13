package FlowControl01;

public class Question03 {
	
    public static void main(String[] args) {
    	
        // Check if command line arguments are provided
        if (args.length == 0) {
        	
            System.out.println("No values");
            
        } else {
        	
            // Concatenate all command line arguments with commas
            String values = String.join(",", args);
            
            System.out.println(values);
        }
    }
}
