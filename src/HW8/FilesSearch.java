package HW8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilesSearch {
		
	static int countFilesInFolder (File file, int counter) {
		File [] ff = file.listFiles();
		for (File fine : ff) {
			if (fine.isFile()) {
				counter++;
			}
		}
		return counter;
	}
	
	static int countFilesInFolderWithEnding (File file, String end, int counter) {
		File [] ff = file.listFiles ((File p) -> p.getName().endsWith(end));
		for (File fine : ff) {
			if (fine.isFile()) {
				counter++;
			}
		}
		return counter;
	}
	

	
	static int countFoldersInFolder (File file, int counter) {
		File [] ff = file.listFiles();
		for (File fine : ff) {
			if (fine.isDirectory()) {
				counter++;
			}
		}
		return counter;
	}
	

	
	
	static String allFilesInFolderByFilter (File file, String end, int depth) throws IOException {
		
		try (Stream <Path> stream = Files.find(Paths.get(file.getPath()) , depth, (path, attr) -> {
						return String.valueOf(path).endsWith(end);}))
		{				
		String allFiles = stream.sorted().map(String::valueOf).collect(Collectors.joining(";\n "));
		return allFiles;
		}
	}

	
	static int allFilesInFolderByFilterCounter (File file, String end, int depth) throws IOException {
		
		try (Stream <Path> stream = Files.find(Paths.get(file.getPath()) , depth, (path, attr) -> {
						return String.valueOf(path).endsWith(end);}))
		{				
		int counter = (int) stream.count();
		return counter;
		}
	}
		

	
	public static void main(String[] args) throws IOException {

		File f = new File ("D:\\Temp");
		String ending = ".exe";
		int depth = 10;
		
		System.out.println("in folder " + f.getPath() + " we have " + countFilesInFolder(f,0) + " files" + "\n");
		System.out.println("in folder " + f.getPath() + " we have " + countFoldersInFolder(f,0) + " folders" + "\n");

		System.out.println("in folder " + f.getPath() + " we have " + countFilesInFolderWithEnding(f, ending ,0) + " " + ending + " files" + "\n");
		
		System.out.println("Here are all the files with ending - " + ending + " in depth of search - " + depth + ":\n" + allFilesInFolderByFilter (f, ending, depth) + "\n");
		System.out.println(" Total quantity of files with ending - " + ending + " in depth of search - " + depth + " is " + allFilesInFolderByFilterCounter (f, ending, depth) + "\n");
	
	}
}
