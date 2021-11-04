package com.ss.jb.assignment1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author thoma
 *
 */
public class FileList {
	
	
	public static void main(String[] args) throws IOException, NullPointerException {
		try {
		File folder;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ABSOLUTE PATH OF DIRECTORY TO LIST ALL FILES AND DIRECTORIES OR PRESS ENTER TO SEE TEST FOLDER:");
		String input = sc.nextLine();
		if(input == "") {
			folder = new File("testFolder");
		}
		else {
			folder = new File(input);
		}
		
		isFolder(folder);
		} catch (Exception NullPointerException) {
			System.out.println("NOT A VALID FILE PATH");
			main(args);
		}
		
	}
	
	public static void isFolder(File folder) {
		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				isFolder(file);
			}
			
			System.out.println(file.getPath());
		}
	}

}

