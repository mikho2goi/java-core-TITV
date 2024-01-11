package java_16;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ketqua,a,b; 

		System.out.println("Phuong trinh bac nhat co dang ax + b = 0");
		
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap b :");
		b = sc.nextDouble();
		
		if(a == 0) {
			if(b==0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}else {
			System.out.println("Phuong trinh vo nghiem");
			}
		
		}
		else {
			ketqua = -b/a;
			System.out.println("Nghiem cua phuong trinh la :"+ketqua);
		}
		
	
	}
	
}
