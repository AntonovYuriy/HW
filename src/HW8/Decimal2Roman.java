package HW8;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//ЗАДАЧА
//Создать класс с двумя статическими методами перевода из десятичной системы счисления в римскую и обратно.
//
//public static String decimal2Roman(int x) { ... }
//public static int roman2Decimal(String s) { ... }
//
//Рабочий диапазон методов - от 1 до 100 включительно.
//Работу методов продемонстрировать так:
//DECIMAL ==decimal2Roman==> ROMAN ==roman2Decimal==> DECIMAL
//1 ====> I ====> 1
//2 ====> II ====> 2
//3 ====> III ====> 3
//4 ====> IV ====> 4
//5 ====> V ====> 5
//...
//94 ====> XCIV ====> 94
//95 ====> XCV ====> 95
//96 ====> XCVI ====> 96
//97 ====> XCVII ====> 97
//98 ====> XCVIII ====> 98
//99 ====> XCIX ====> 99
//100 ====> C ====> 100
//Брут-форс (полный перебор) не допускается! Решение которое использует массив из ста элементов
//String[] numbers = {"I", "II", "III", "IV", "V", ..., "XCV", "XCVI", "XCVII", ..., "C"} не годится.
//Продумать алгоритм и запрограммировать.

// ВВОД ИНТ ЧИСЛА
public class Decimal2Roman {

	public static int input(int limit) {
		int nextInt = 0;
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите число до " + limit + " : ");
			try {
				nextInt = sc.nextInt();
			} catch (Exception e) {
				System.out.println(" Что-то пошло не так ... надо повторить ввод числа");
				input(limit);
			}
			System.in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nextInt;
	}

	// Из десятичной в римскую
	public static String decimal2Roman(String result, int x) {

		final TreeMap<Integer, String> roman = new TreeMap<Integer, String>(Collections.reverseOrder());
		roman.put(1000, "M");
		roman.put(900, "CM");
		roman.put(500, "D");
		roman.put(400, "CD");
		roman.put(100, "C");
		roman.put(90, "XC");
		roman.put(50, "L");
		roman.put(40, "XL");
		roman.put(10, "X");
		roman.put(9, "IX");
		roman.put(5, "V");
		roman.put(4, "IV");
		roman.put(1, "I");

		for (@SuppressWarnings("rawtypes")
		Map.Entry e : roman.entrySet()) {
			// System.out.println(e.getKey() + " - " + e.getValue() + " x= " + x + " result
			// = " + result);
			if (x >= (Integer.parseInt(e.getKey().toString()))) {
				result += e.getValue().toString();
				x = x - (Integer.parseInt(e.getKey().toString()));
				result = decimal2Roman(result, x);
				break;
			}
		}

		return result;
	}

	// Перегруженный метод для облегчения восприятия
	public static String decimal2Roman(int x) {
		return decimal2Roman("", x);
	}

	// Из Римской в десятичную
	public static int roman2Decimal(java.lang.String romanNumber) {
		int decimal = 0;
		int lastNumber = 0;
		String romanNumeral = romanNumber.toUpperCase();
		for (int x = romanNumeral.length() - 1; x >= 0; x--) {
			char convertToDecimal = romanNumeral.charAt(x);

			switch (convertToDecimal) {
			case 'M':
				decimal = processDecimal(1000, lastNumber, decimal);
				lastNumber = 1000;
				break;

			case 'D':
				decimal = processDecimal(500, lastNumber, decimal);
				lastNumber = 500;
				break;

			case 'C':
				decimal = processDecimal(100, lastNumber, decimal);
				lastNumber = 100;
				break;

			case 'L':
				decimal = processDecimal(50, lastNumber, decimal);
				lastNumber = 50;
				break;

			case 'X':
				decimal = processDecimal(10, lastNumber, decimal);
				lastNumber = 10;
				break;

			case 'V':
				decimal = processDecimal(5, lastNumber, decimal);
				lastNumber = 5;
				break;

			case 'I':
				decimal = processDecimal(1, lastNumber, decimal);
				lastNumber = 1;
				break;
			}
		}
		return (decimal);
	}

	// Проверка предыдущего символа
	public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
		if (lastNumber > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}

	// TEST
	public static void Test2Roman2Decimal(int count) {
		for (int i = 0; i <= count; i++) {
			System.out.printf("%d ==> %s ==> %d %n", i, decimal2Roman(i), roman2Decimal(decimal2Roman(i)));
			;
		}
	}

	public static void main(String[] args) {

		int i = input(10000);
		System.out.printf("%d ==> %s ==> %d %n", i, decimal2Roman(i), roman2Decimal(decimal2Roman(i)));
		;

	}

}
