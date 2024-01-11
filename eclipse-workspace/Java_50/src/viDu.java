
public class viDu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.VN";
		String s3 = "titv.vn";
		
		System.out.println("s1 equal s2 "+s1.equals(s2));
		System.out.println("s1 equal s3 "+s1.equals(s3));
		
		System.out.println("s1 equalIgnoreCase s2 "+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalIgnoreCase s3 "+s1.equalsIgnoreCase(s3));
		
		System.out.println("s1 toUpperCase "+s1.toUpperCase());
		
		System.out.println("s1 compare s2 "+s1.compareTo(s2));
		System.out.println("s1 compare s3 "+s1.compareTo(s3));
		System.out.println("s2 compare s3 "+s2.compareTo(s3));
		// compare bỏ qua chữ hoa thường
		System.out.println("s1 compare s2 "+s1.compareToIgnoreCase(s2));
		System.out.println("s1 compare s3 "+s1.compareToIgnoreCase(s3));
		System.out.println("s2 compare s3 "+s2.compareToIgnoreCase(s3));
		
		//So Sánh một đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		System.out.println("r1 regionMatches r2 "+r1.regionMatches(2, r2, 0, 4));
		
		// startWith => Hàm kiểm tra chuỗi bắt đầu bằng
		String sdt = "09328493388";
		
		System.out.println(sdt.startsWith("0932"));
		System.out.println(sdt.startsWith("0939"));
		
		// endWith kiểm tra chuỗi kết thúc bằng
		String tenFile = "I love you.JPG";
		String tenFile2 = "I love you.PDF";
		
		if(tenFile.endsWith(".JPG")) {
			System.out.println("file 1 la hinh anh");
		}else if(tenFile.endsWith(".PDF")) {
			System.out.println("File 1 la PDF");
		}
		
		if(tenFile2.endsWith(".JPG")) {
			System.out.println("file 2 la hinh anh");
		}else if(tenFile2.endsWith(".PDF")) {
			System.out.println("File 2 la PDF");
		}
		
		
	}
}
