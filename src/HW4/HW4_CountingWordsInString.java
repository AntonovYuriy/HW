package HW4;

public class HW4_CountingWordsInString {

	public static void main(String[] args) {

		String s = "Hello my world!!!";
//		String s = "Have you tried to read and understand Java’s String format documentation? I have and found it hard to understand. While it does include all the information, the organization leaves something to be desired";
		System.out.printf("Our input string is %n" + s + "%n");
		
		System.out.println("First way - we have " + HowManySpaces(s) + " scaces");
		System.out.println("First way - we have " + (HowManySpaces(s)+1) + " words");
	
	}
	
	
// First way
		
	static int HowManySpaces (String st) {
		int counter = 0;
		if (st.length() != 0) 
			for (int i = 0; i < st.length(); i++)
				if (st.charAt(i) == ' ') 
					counter++;
		return counter;			
			

	}

}
