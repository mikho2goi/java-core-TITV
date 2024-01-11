package viDu;

import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		String s = "Xin chào các bạn , tui là peter";
		String[] a = s.split(" ");
		
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "xin chao,Minh la peter. minh la lap trinh vien!";
		
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		String s3 = "Nguyen van a";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("name : "+d[d.length-1]);
	}
}
