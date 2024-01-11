package java_07;

import java.util.Scanner;

public class viDu {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao ho va ten");
		String hovaten = sc.nextLine();
		
		System.out.println("Nhap Ma sinh vien");
		String mssv = sc.nextLine();
		
		System.out.println("Nhap Diem Thi");
		float diem = sc.nextFloat();
		
		System.out.println("-----------------");
		System.out.println("MSSV: "+mssv);
		System.out.println("Ho Ten Sinh Vien: "+hovaten);
		System.out.println("Diem Thi Sinh Vien: "+diem);
		
	}
}
