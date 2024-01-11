package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\Java_73(WriteObject)\\file.data");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		SinhVien sv = new SinhVien("B2012144","Le Minh Thien",2002,9);
		
		oos.writeObject(sv);
		
		oos.flush();
		oos.close();
		
		
		
		
		
	}
}
