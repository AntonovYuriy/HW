//6. считать текст из файла. 
//Вывести информацию в консоль по частоте использования букв в таком формате:
//буква: количество раз в файле
//При чем вверху должны выводиться буквы самые редкие, внизу самые частые

package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountSymbolsFromFile {

	public static void charsCounterFromFile(String f) {
		try (BufferedReader fileRead = Files.newBufferedReader(Paths.get(f))) {
			String stringInFile = "";
			Map<Character, Integer> allData = new HashMap<Character, Integer>();
			while ((stringInFile = fileRead.readLine()) != null) {
				allData = newStringAdd(allData, counterOfChars(stringInFile));
			}
			ShowInfo(allData);
			fileRead.close();
		} catch (IOException e) {
			System.out.println("Ошибка с доступом к файлу.");
			e.printStackTrace();
		}
	}

	public static Map<Character, Integer> newStringAdd(Map<Character, Integer> main,
			Map<Character, Integer> additional) {
		additional.forEach((key, value) -> {
			if (main.containsKey(key)) {
				main.put(key, (main.get(key) + 1));
			} else
				main.put(key, 1);
		});
		return main;
	}

	public static void ShowInfo(Map<Character, Integer> m) {
		Map result = m.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		result.forEach((key, value) -> {
			System.out.println("Symbol : " + key + " were met : " + value + " times.");
		});
	}

	public static Map<Character, Integer> counterOfChars(String s) {
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		char[] chars = s.toCharArray();
		for (Integer i = 0; i < chars.length; i++) {
			if (Character.isLetter(chars[i])) {
				Integer count = result.get(i);
				Character symbol = chars[i];

				if (count == null) {
					result.put(symbol, 1);
				} else {
					result.put(symbol, (count + 1));
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		charsCounterFromFile("D:\\Temp\\1.csv");
	}
}
