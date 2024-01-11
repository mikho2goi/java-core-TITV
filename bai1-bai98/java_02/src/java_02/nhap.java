package java_02;

import java.util.Scanner;

public class nhap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ho va ten: ");
		String hoVaTen = sc.nextLine();
		System.out.println(""+hoVaTen);
		String mang[];
		mang = new String[10];
		for (int i = 0; i < mang.length; i++) {
			System.out.println("Nhap phan tu thu "+i);
			mang[i] = sc.next();
		}
		for (int i = 0; i < mang.length; i++) {
			System.out.println("Phan tu thu "+i+" la "+mang[i]);
		}
	}
}
