package java_24;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen to n lon hon 0");
		int n = sc.nextInt();
		String nhiphan = "";
		while(n>0) {
		nhiphan = (n%2) + nhiphan;
		n = n/2;
		}
		System.out.println(nhiphan);
		
	}
}
