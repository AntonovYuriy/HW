//Написать программу Text editor 
//Программа позволяет пользователю, взаимодействуя с консолью записывать в файл.
//Программа завершается, если наберу слово “exit”
//По завершению программы, вывести статистику файла:
//Содержимое файла в консоль.
//Общее количество символов
//Номер строки с самым большим количеством гласных
//количество слов (регулярное выражение для всех пробелов)
//В программе использовать:
//Files.write()
//StandardOpenOption
//Files.lines

package HW8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

class LineInfo {
	String line;
	int vowels;
	int symbols;
	int words;
	int number;

	public String getLine() {
		return line;
	}

	public int getVowels() {
		return vowels;
	}

	public int getSymbols() {
		return symbols;
	}

	public int getWords() {
		return words;
	}

	public int getNumber() {
		return number;
	}

	public LineInfo(String line, int lNumber) {
		this.line = line;
		this.vowels = howManyVowelsInLine(line);
		this.symbols = howManySymbolsInLine(line);
		this.words = howManyWordsInLine(line);
		this.number = lNumber;
	}

	public int howManyVowelsInLine(String s) {
		int counter = 0;
		Pattern vowelP = Pattern.compile("[AEIOUYaeiouy]");
		Matcher vowelM = vowelP.matcher(s);
		while (vowelM.find()) {
			counter++;
		}
		return counter;
	}

	public int howManySymbolsInLine(String s) {
		int counter = s.length();
		return counter;
	}

	public int howManyWordsInLine(String s) {
		int counter = s.split(" ").length;
		return counter;
	}

}

public class TextEditor {

	private static final Charset CharSet = StandardCharsets.UTF_8;
	private static String FileName = "D:\\Temp\\1.txt";

	public static void writeToFileFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lines of test for file. Type \"exit\" for finish ... ");
		String text = sc.nextLine();
		while (!text.equals("exit")) {
			try {
				BufferedWriter writeInfo = Files.newBufferedWriter(Paths.get(FileName), CharSet,
						StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
				writeInfo.write(text);
				writeInfo.newLine();
				writeInfo.close();
			} catch (IOException e) {
				System.out.print("Ошибка ввода - ");
				e.printStackTrace();
			}
			text = sc.nextLine();
		}
		System.out.println("Запись закончена ...");
		sc.close();
	}

	public static void countSymbolsInFile() {
		int symbolCounter = 0;
		BufferedReader readed;
		try {
			readed = Files.newBufferedReader(Paths.get(FileName), CharSet);
			String line;
			while ((line = readed.readLine()) != null) {
				symbolCounter += line.length();
			}
			readed.close();
		} catch (IOException e) {
			System.out.print(" Error in accessing file ...");
			e.printStackTrace();
		}
		System.out.println("В файле - " + symbolCounter + " символ(ов) ...");
	}

	public static void statCounter() throws IOException {

		Scanner sc = new Scanner(new File(FileName));
		ArrayList<LineInfo> lines = new ArrayList<LineInfo>();
		int lineNumber = 1;
		while (sc.hasNextLine()) {
			lines.add(new LineInfo(sc.nextLine(), lineNumber));
			lineNumber++;
		}

		lines.stream().sorted((line1, line2) -> {
			return line2.getVowels() - line1.getVowels();
		}).limit(1).forEach(l -> System.out
				.println("Больше всего гласных в строке " + l.getNumber() + " их тут - " + l.getVowels()));

		int totalwords = 0;
		for (LineInfo l : lines) {
			totalwords += l.words;
		}

		System.out.println("Total number of words in file is " + totalwords);

		sc.close();
	}

	public static void showFileToConsole() {

		Stream<String> fileLines;
		try {
			fileLines = Files.lines(Paths.get(FileName), CharSet);
			fileLines.forEach(System.out::println);
			fileLines.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		// writeToFileFromConsole ();
		// countSymbolsInFile ();
		// showFileToConsole ();
		// whatStringHaveMostVowels ();
		statCounter();

	}
}