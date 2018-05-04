package HW4;

import java.util.*;

public class HW4_ArrayReturnMaximal {

	public static void main(String[] args) {
	
//MAIN 
		int len = (int) Math.round( (Math.random() * 30));
		int arr [] = new int [len];
		arr = rand (arr);
		System.out.println( Bigest (arr));

	}

	
// Taking Biggest
	static int Bigest (int [] m) {
		Arrays.sort(m);
		return m [m.length-1];
	}
	
	
// Fill array with random	
	static int [] rand (int [] m) {
		int [] massive = new int [m.length];
		for (int i = 0; i < (m.length-1); i++) {
			massive [i] = (int) Math.round( (Math.random() * 100));
			System.out.print(massive [i] + " ");
		}
		System.out.println();
		return massive;
	}	
}
