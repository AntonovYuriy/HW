// Вывести на экран 5 строк числа Пи
//в первой строке 1 знак после запятой, во второй два знака после запятой и так далее
//java.util.Formatter


package HW8;

import java.util.Formatter;

public class FiveLinesPI {
	
	public static void piVieverNoFormatter () {
		System.out.println("With no formatter ...");
		System.out.printf("%." + 1 + "f%n", Math.PI);
		System.out.printf("%." + 2 + "f%n", Math.PI);
		System.out.printf("%." + 3 + "f%n", Math.PI);
		System.out.printf("%." + 4 + "f%n", Math.PI);
		System.out.printf("%." + 5 + "f%n", Math.PI);
	}
	
	public static void piVieverNoFormatter (int quantity) {
		System.out.println("With no formatter 2 (different quantity ...");
		for (int i = 1; i < (quantity+1); i++) {
			System.out.printf ("%." + i + "f%n", Math.PI);
		}
	}
	
	public static void piStringNoFormatter (int quantity) {
		String s = Double.toString(Math.PI);
		quantity = quantity +2;
		for (int i = 0; i < quantity; i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	public static void piStringNoFormatterAllLines (int quantity) {
			for (int i = 1; i < (quantity+1); i++) {
			piStringNoFormatter(i);
		}
	}
	
	public static void PiWithFormatter(int quantity) {
		System.out.println("Using formatter to view PI ...");
		for (int i = 1; i <= quantity; i++) {
			try (Formatter f = new Formatter()) {
				f.format("%." + i + "f%n", Math.PI);
				System.out.print(f);
			}
		}
		System.out.println();
	}
		
		
	
	public static void main(String[] args) {
		
//		piVieverNoFormatter ();
//		piVieverNoFormatter (5);
//		System.out.println("Just typing characters from Pi string ...");
//		piStringNoFormatter (5);
//		System.out.println("Just typing characters from Pi string for several lines ...");
//		piStringNoFormatterAllLines (5);
		PiWithFormatter(5);
	}

}
