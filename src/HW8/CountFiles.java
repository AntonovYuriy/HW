package HW8;

import java.io.*;

public class CountFiles {

	public String countAllFiles(File file) {
		return count(file, 0, 0);
	}

	public String countFilesWithDirs(File file) {
		return count(file, 0, 0, 0);
	}


	private String count(File file, int visibleFiles, int hiddenFiles) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				visibleFiles++;
				if (f.isHidden()) {
					hiddenFiles++;
				}
			}
		}
		if (file.getParent() == null) {
			return "Top Directory: '" + file.getAbsolutePath() 
			+ "'\nFiles: " + visibleFiles 
			+ "\nHidden files: "  + hiddenFiles;
		}
		return count(new File(file.getParent()), visibleFiles, hiddenFiles);
	}

	
	private String count(File file, int visibleFiles, int hiddenFiles, int isDir) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				isDir++; 
//				System.out.println(f.getAbsolutePath() + "\\\\" +  f.getName() + " has been added as folder");
				}
			
			if (f.isFile()) {
				visibleFiles++;
//				System.out.println(f.getAbsolutePath() + "\\\\" +  f.getName() + " has been added as visible file");				
				if (f.isHidden()) {
//					System.out.println(f.getAbsolutePath() + "\\\\" +  f.getName() + " has been added as hidden file");
					hiddenFiles++;
				}
			}
		}
					

			return "Top Directory: '" + file.getPath() 
					+ "\nHave " + isDir + " Folders"
					+ "'\nFiles: " + visibleFiles 
					+ "\nHidden files: "
					+ hiddenFiles;
	}
	
	
	
	
	public static void main(String[] args) {
		File f = new File("D:\\Important");
		System.out.println("We are at - " + f.getPath());
		CountFiles cf = new CountFiles();
		System.out.println("\n" + cf.countAllFiles(f) + "\n");
		System.out.println(cf.countFilesWithDirs(f));
		
	}
}