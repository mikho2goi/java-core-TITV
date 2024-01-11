package main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
		//Hàm đưa giá trị vào stack
		//stackChuoi.push("a");
		//hàm lấy giá trị ra và xóa khỏi stack
		//stackChuoi.pop();
		//lấy giá trị nhưng không xóa khỏi stack
		//stackChuoi.peek();
		//hàm xóa tất cả phần tử trong stack
		//stackChuoi.clear();
		//hàm xác định giá trị có tồn tại trong stack hay ko
		//stackChuoi.contains(stackChuoi);
		
		System.out.println("Nhập vào chuỗi");
		String s = sc.nextLine();
		// titv
		
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i)+"");
		}
		
		System.out.println("Chuỗi đảo ngược");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}
		System.out.println();
		System.out.println("Nhập vào số thập phân muốn chuyển");
		int stp = sc.nextInt();
		while(stp > 0) {
			stackChuoi.push(stp%2+"");
			stp /= 2;
		}
		while(!stackChuoi.empty()) {
			System.out.print(stackChuoi.pop());
	}
		
		
		
		
		
	}
}
