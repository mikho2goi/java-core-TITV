package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class test {
	public static void coppyAll(File f1,File f2) {
			try {
				Files.copy(f1.toPath(), f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(f1.isDirectory()) {
				File[] mangCon = f1.listFiles();
				for (File file : mangCon) {
					File fileNew = new File(f2.getAbsoluteFile()+"\\"+file.getName());
					coppyAll(file, fileNew);
				}
			}
	}
	
	public static void xoaThuMuc(File f){
		f.deleteOnExit();
		File[] mangCon = f.listFiles();
		for (File file : mangCon) {
			file.deleteOnExit();
				xoaThuMuc(file);
		}
	}
	
	
	public static void main(String[] args) {
		File f0 = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_70\\f0");
		File f1 = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_70\\f0_copy");
		File f2 = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_70\\File_2xyz.txt");

//		f0.renameTo(f1);
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		File f2_new = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_70\\f0\\File_2xyz.txt");
//		
//		try {
//			Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		

	test.coppyAll(f0, f1);
		
		
		
		
		
		
	}
}
