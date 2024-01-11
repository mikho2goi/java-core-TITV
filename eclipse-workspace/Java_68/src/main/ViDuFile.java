package main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;
	
	
	
	public ViDuFile(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		return this.file.canExecute();
	}
	public boolean kiemTraDoc() {
		return this.file.canRead();
	}
	public boolean kiemTraViet() {
		return this.file.canWrite();
	}
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	public void inTen() {
		System.out.println(this.file.getName());
	}
	public void kiemTraThuMucHayTapTin() {
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
		} else if(this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
		
	}
	public void inDanhSachCacFileCon() {
		if (this.file.isDirectory()) {
		File[] mangcon = this.file.listFiles();
		 for (File file : mangcon) {
			System.out.println(file.getAbsolutePath());
		}
		
		
		} else if(this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
		
	
	}
	public static void main(String[] args) {
		System.out.println("Nhập tên file: ");
		Scanner sc = new Scanner(System.in);
		
		String tenFile = sc.nextLine();

		ViDuFile vdf = new ViDuFile(tenFile); 
		int luaChon = 0;
		do {
			System.out.println("----------MENU-----------");
			System.out.println("1. Kiểm tra file có thể thực thi");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file : ");
			System.out.println("6. Kiểm tra tên file là thư mục hoặc tập tin: ");
			System.out.println("7. In danh sách các file con : ");
			System.out.println("8. In cây thư mục: ");
			System.out.println("0. Thoát khỏi chương trình.");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			switch (luaChon) {
			case 1: {
				System.out.println("File có thể thực thi hay không: "+vdf.kiemTraThucThi()); 
				break;
			}
			case 2: {
				System.out.println("File có thể đọc hay không: "+vdf.kiemTraDoc()); 
				break;
			}
			case 3: {
				System.out.println("File có thể ghi hay không: "+vdf.kiemTraViet()); 
				break;
			}
			case 4: {
				vdf.inDuongDan();
				break;
			}
			case 5: {
				vdf.inTen();
				break;
			}
			case 6: {
				vdf.kiemTraThuMucHayTapTin();
				break;
			}
			case 7: {
				vdf.inDanhSachCacFileCon();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + luaChon);
			}
			
			
			
		} while (luaChon != 0);
	}
}