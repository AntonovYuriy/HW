//11. �������� �����, ������� ��������� ������ ������� � ������� ���������� ���������� �������� ����� ������� � �������� �������� (� ��������� �����������)
//����� ����� ��������� ������ ��� � 24 ��� � � 12 ������� �������, ����������� ����������, ������ �����:
//12:25, 20:12 � �.�.

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
		System.out.println("������� ����� � ������� ����:������ � am/pm ��� ��������������");
		System.out.println("�������� ��:�� �� ��� �:� �� ");
		System.out.println("�� ��������� (���� �� ������� am/pm) - ���������, ��� 24 ������� ������� ...");
		String inputTime = sc.nextLine();
		String[] allTime = inputTime.split(":");
		int hours = Integer.parseInt(allTime[0]);
		String[] minutesTime = allTime[1].split(" ");
		int minutes = Integer.parseInt(minutesTime[0]);
		System.out.println("����������, ��� ����� ������� � �������� �������� - "
				+ degreeCounter(hours, minutes, formatTime(inputTime)) + " ��������+");
	}

}
