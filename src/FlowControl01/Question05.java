package FlowControl01;

public class Question05 {
	
	static void CheckChar(char ch) {
		if(Character.isLetter(ch))
			System.out.println(ch + " is an Alphabet");
		else if(Character.isDigit(ch))
			System.out.println(ch + " is a Digit");
		else
			System.out.println(ch + " is a Special charater");
	}
	
    public static void main(String[] args) {
    	
    	char char1 = 'A';
    	char char2 = '\u0037';
    	char char3 = '%';
    	
    	CheckChar(char1);
    	CheckChar(char2);
    	CheckChar(char3);
    	
    	
    	
    }
}