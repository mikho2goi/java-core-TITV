
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(13, 07, 2002);
		Ngay ngay2 = new Ngay(11, 01, 2012);
		Ngay ngay3 = new Ngay(10, 12, 2032);
		
		TacGia tacGia1 = new TacGia("Le Minh Thien", ngay1);
		TacGia tacGia2 = new TacGia("Le Hoang Thien", ngay2);
		TacGia tacGia3 = new TacGia("Le Nhat Thien", ngay3);
	
		Sach sach1 = new Sach("Lap Trinh Can Ban", 265.5, 2013, tacGia1);
		Sach sach2 = new Sach("Lap Trinh Huong Doi Tuong", 323.56, 2025, tacGia2);
		Sach sach3 = new Sach("Co So Du Lieu", 552.56, 2013, tacGia3);
		
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println(sach1.getGiaBan());
		System.out.println(sach1.giaSauKhiGiam(50));
		
		System.out.println(tacGia1.getTenTacGia());
		
		System.out.println(sach1.equals(sach2));
		System.out.println(sach1.equals(sach3));
		System.out.println(sach2.equals(sach3));
	}
}
