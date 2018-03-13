package HW4;

import java.util.Scanner;

public class HW4_ArraysByPluses {

	
	
	public static void main(String[] args) {

		int hi = vvod ("Height");
		int le = vvod ("Width");
		
		System.out.println ("Height is " + hi + "; Width is - " + le);
				
		raspechatka ( hi,  le);
	}	

	
// Printing array	
	
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
	

	
// Input 
	
	static int vvod(String na) {
		Scanner sc = new Scanner ( System.in);
		System.out.print ("what " + na + " ");		
		int vv = sc.nextInt();
		System.out.println (na + " will be " + vv);		
		return vv;
	}
	
	
}


