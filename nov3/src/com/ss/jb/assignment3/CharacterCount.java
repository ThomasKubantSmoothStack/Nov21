/**
 * 
 */
package com.ss.jb.assignment3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author thomas
 *
 */
public class CharacterCount {

	public static void main(String[] args) throws IOException {
		String input;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT A CHARACTER TO COUNT HOW MANY TIMES IT APPEARS IN THE FILE.");
		input = sc.nextLine();
		File file = new File("src/com/ss/jb/assignment3/text.txt");
		FileReader reader = new FileReader(file);
		int i;
		while((i = reader.read()) != -1) {
			if(Character.toString((char)i).equals(input)) {
				count = count + 1;
			}
		}
		System.out.println("There are " + count + " " + input + "'s in this document!");
		reader.close();
		sc.close();
	}

}
