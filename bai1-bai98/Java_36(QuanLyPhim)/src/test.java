
public class test {
	public static void main(String[] args) {
		
		NgayChieu ngay1 = new NgayChieu(13, 10, 2016);
		NgayChieu ngay2 = new NgayChieu(10, 7, 2025);
		NgayChieu ngay3 = new NgayChieu(13, 9, 2023);
		
		HangSanXuat hang1 = new HangSanXuat("Marvel","Anh");
		HangSanXuat hang2 = new HangSanXuat("TiTan","Japan");
		HangSanXuat hang3 = new HangSanXuat("CGV","VietNam");
		
		BoPhim phim1 = new BoPhim("Thor", 250000, 2023, hang1, ngay1);
		BoPhim phim2 = new BoPhim("Spider-Man", 690000, 2023, hang2, ngay2);
		BoPhim phim3 = new BoPhim("Loki", 150000, 2023, hang3, ngay3);
		
		System.out.println("Gia phim 1 co re hon phim 2 "+phim1.soSanhGiave(phim2));
		System.out.println("Gia phim 1 co re hon phim 3 "+phim1.soSanhGiave(phim3));
		System.out.println("Gia phim 2 co re hon phim 3 "+phim2.soSanhGiave(phim3));
		
		System.out.println("----------------");
		
		System.out.println("Ten hang san xuat bo phim 1 "+phim1.tenHang());
		System.out.println("Ten hang san xuat bo phim 2 "+phim2.tenHang());
		System.out.println("Ten hang san xuat bo phim 3 "+phim3.tenHang());
		
		System.out.println("----------------");
		
		System.out.println("Gia ve phim1 sau khi giam 10% "+phim1.giaSauKhiGiam(10));
		System.out.println("Gia ve phim2 sau khi giam 20% "+phim2.giaSauKhiGiam(20));
		System.out.println("Gia ve phim3 sau khi giam 50% "+phim3.giaSauKhiGiam(50));
		
		
	}
}
