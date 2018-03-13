package HW4;

import java.util.Scanner;

public class HW4_ArraysByPluses {

	
	
	public static void main(String[] args) {

		int hi = vvod ("Высота");
		int le = vvod ("Ширина");
		
		System.out.println ("Высота будет " + hi + " Ширина будет - " + le);
				
		raspechatka ( hi,  le);
	}	

	
// Распечатка массива	
	
	static void raspechatka (int hi, int le) {
		
		char arr[][] = new char [hi][le];
		
		for (int i = 0; i < hi; i++) {
			for (int j = 0; j < le; j++) {
				arr [i][j] = '+' ;
				System.out.print (arr [i][j] );
				
			}
			System.out.println();
		}
	}
	

	
// Ввод 
	
	static int vvod(String na) {
		Scanner sc = new Scanner ( System.in);
		System.out.print ("какая " + na + " ");		
		int vv = sc.nextInt();
		System.out.println (na + " будет " + vv);		
		return vv;
	}
	
	
}


