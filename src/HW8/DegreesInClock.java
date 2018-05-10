//11. Написать метод, который принимает строку времени и который возвращает количество градусов между часовой и минутной стрелкой (в почасовом направлении)
//Метод может принимать строки как в 24 так и в 12 часовом формате, разделенных двоеточием, пример строк:
//12:25, 20:12 и т.д.

package HW8;

import java.util.Scanner;

public class DegreesInClock {

	public static int formatTime(String time) {
		if (time.substring(time.length() - 1).toUpperCase().equals("M")) {
			return 12;
		} else {
			return 24;
		}
	}

	public static int degreeCounter(int hour, int minutes, int formatTime) {
		int result = 123;
		int hourDegree = 360 / formatTime * hour;
		int minuteDegree = 360 / 60 * minutes;
		if (hourDegree >= minuteDegree) {
			result = hourDegree - minuteDegree;
		} else {
			result = 360 - hourDegree - minuteDegree;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите время в формате часы:минуты и am/pm при необходисмости");
		System.out.println("Например ЧЧ:ММ АМ или ч:м рм ");
		System.out.println("По умолчанию (если не введено am/pm) - считается, что 24 часовая система ...");
		String inputTime = sc.nextLine();
		String[] allTime = inputTime.split(":");
		int hours = Integer.parseInt(allTime[0]);
		String[] minutesTime = allTime[1].split(" ");
		int minutes = Integer.parseInt(minutesTime[0]);
		System.out.println("Получается, что между часовой и минутной стрелкой - "
				+ degreeCounter(hours, minutes, formatTime(inputTime)) + " градусов+");
	}

}
