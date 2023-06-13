package FlowControl01;

public class Question07 {
	
	static void CheckCase(char ch) {
		char newCh;
		if(Character.isUpperCase(ch)) {
			newCh = Character.toLowerCase(ch);
			System.out.println(ch + " --> " +newCh);
		}
		else {
			newCh = Character.toUpperCase(ch);
			System.out.println(ch + " --> " +newCh);
		}
			
			
	}
	
	public static void main(String[] args) {
		char ch ='M';
		CheckCase(ch);
	}
}