package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class test {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			
			pw = new PrintWriter("C:\\Users\\ASUS\\eclipse-workspace\\Java_71(FilePrint)\\file.txt","UTF-8");
			pw.println("Hello World");
			pw.print(3.14);
			pw.println();
			pw.print("Là số PI");
			pw.println();
			
			Student st = new Student("thiên", 18);
			pw.println(st);

			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}
}
