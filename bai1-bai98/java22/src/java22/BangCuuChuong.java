package java22;

import java.util.Scanner;

public class BangCuuChuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Bạn muốn hiển thị bảng cửu chương nào?");
		n = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(n +" x "+ i +" = " + n*i);
		}
		
		
		
	}
}
