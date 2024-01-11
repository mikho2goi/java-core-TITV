package main;

import java.io.File;
import java.io.IOException;

public class flieTest {
		public static void main(String[] args) {
			File f = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_67(FILE)");
			File f2 = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_67(FILE)\\vidu.txt");
			
			System.out.println( f.exists());
			try {
				f2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
}
