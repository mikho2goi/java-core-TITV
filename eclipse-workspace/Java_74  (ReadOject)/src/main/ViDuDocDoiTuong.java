package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
	public static void main(String[] args) throws IOException {
		try {
			File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_73(WriteObject)\\file2.txt");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv = (SinhVien) ois.readObject();
			System.out.println(sv.getDiemTB());
			System.out.println(sv);
			
			
		} catch (ClassNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
		
		
		
		
	}
}
