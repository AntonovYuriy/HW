package HW8;

import java.io.File;

public class CountDirs {
	
	public CountDirs (File file) {};
	
	static int counter = 0;
	
	public static void countDirs (File file) throws NullPointerException {
		File [] files = file.listFiles ();
		for (File f1 : files) {
			if (f1.isDirectory()) {
				counter ++;
				File f2 = new File (file.getAbsolutePath().toString() + "\\" + f1.getName());
//				System.out.println(file.getAbsolutePath() + "\\" + f1.getName());
				countDirs (f2);
			}
		}
//		System.out.println("Total " + counter + " ditecrtories till " + file.getPath());
}
	
	public static int folderCounter(File file) {
		return CountDirs.counter;
	}
	
	
	public static void main(String[] args) {
		File f = new File("D:\\TomCat");
		if (f.exists()) {
			System.out.println("We are at - " + f.toString());
			countDirs(f);
			System.out.println("Total folder " + f.getAbsolutePath() + " have " + counter + " inner folders.");

			}
			else System.out.println("WRONG PATH");
	}
}

