/**
 * 
 */
package com.ss.jb.assignment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author thoma
 *
 */
public class AppendTextToFile {
	
	public static void main(String[] args) throws IOException {
		File file = new File("src/com/ss/jb/assignment2/text.txt");
		Writer output = new BufferedWriter(new FileWriter(file, true));
		output.append("New text!");
		output.close();
	}

}
