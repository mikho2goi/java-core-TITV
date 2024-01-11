package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		/* Cach 1
		 * 
		 
		File f = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_72(FileREAD)\\file.txt");
		try {
			BufferedReader bf = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true) {
				line = bf.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	*/
		/* Cach 2*/
		
		File f2 = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_72(FileREAD)\\file.txt");
		try {
			List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
