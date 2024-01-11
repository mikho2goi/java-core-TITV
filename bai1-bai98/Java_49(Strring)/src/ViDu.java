import java.util.Iterator;
import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào 1 chuỗi");
		
		s = sc.nextLine().trim();
		System.out.println("--------------");
		System.out.println(s.length());
		System.out.print(s.getBytes());
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
}
