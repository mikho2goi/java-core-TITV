package java_19;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so nguyen tu 2 den 8");
		int n = sc.nextInt();
		
		switch (n) {
		case 2: {
			System.out.println("Thứ Hai");
			break;
		}
		case 3:{
			System.out.println("Thứ Ba");
			break;
		}
		case 4:{
			System.out.println("Thứ Tư");
			break;
		}
		case 5:{
			System.out.println("Thứ Năm");
			break;
		}
		case 6:{
			System.out.println("Thứ Sáu");
			break;
		}
		case 7:{
			System.out.println("Thứ Bảy");
			break;
		}case 8:{
			System.out.println("Thứ Chủ Nhật");
			break;
		}
		default:
			System.out.println("Nhập dữ liệu sai");
		}
		
		
		
	}
}
