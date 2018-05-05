//Дан текст. Напечатать текст, поставив первый символ каждого слова в верхний регистр.
//When I was younger
//I never needed
//
//и результат
//
//When I Was Younger
//I Never Needed


package HW8;

import java.awt.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstSymbolToUppercase {
	
// Подсмотренный вариант	

	static Pattern pattern = Pattern.compile("(?<!\\w)\\w", Pattern.MULTILINE);
	public static StringBuffer ToUpperCase(String text){	
		Matcher matcher = pattern.matcher(text);
		StringBuffer result = new StringBuffer();		
		while(matcher.find()){
			matcher.appendReplacement(result,matcher.group().toUpperCase());
		}
		matcher.appendTail(result);
		return result;
	}

// МОЙ начальный вариант
	
	public static String firstSToUp (String s) {
	String[] st = s.split(" ");
	String stfin = "";
	for (int i = 0; i < st.length; i++) {
		char seek = st[i].charAt(0);
		char replace = Character.toUpperCase(seek);
//		System.out.println( seek + "-->" + replace);
		st [i] = st[i].replaceFirst(Character.toString(seek), Character.toString(replace));
		stfin += st[i];
		if (i < st.length )
				{stfin += " ";}
	}
	return stfin;
	}

	public static void main(String[] args) {

		String st = "The second method chars creates a stream for all characters of the string, so you can use stream operations upon those characters";
		System.out.println(" it was like this \n" + st);
		System.out.println("And now it is like this (with pattern) --- ");
		System.out.println(ToUpperCase(st));
		System.out.println("And now it is like this (string array) --- ");
		System.out.println(firstSToUp(st));
	}

}
