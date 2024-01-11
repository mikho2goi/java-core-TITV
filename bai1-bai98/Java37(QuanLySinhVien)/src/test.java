
public class test {
	public static void main(String[] args) {
		
		Ngay ngay1 = new Ngay(13, 07, 2002);
		Ngay ngay2 = new Ngay(23, 07, 2001);
		Ngay ngay3 = new Ngay(13, 07, 2002);

		Lop lop1 = new Lop("DI20965", "CNTT");
		Lop lop2 = new Lop("DqweI20965", "KTPM");
		Lop lop3 = new Lop("DI209qw5", "HTMT");
		
		SinhVien sinhvien1 = new SinhVien("B2012144", "Le Minh Thien", ngay1, 9.8, lop1);
		SinhVien sinhvien2 = new SinhVien("B2011552", "Hoang Nhat B", ngay2, 8.2, lop2);
		SinhVien sinhvien3 = new SinhVien("B2056483", "Nguyen Van A", ngay3, 4.8, lop3);
		
		sinhvien1.inTenKhoa();
		sinhvien2.inTenKhoa();
		sinhvien3.inTenKhoa();
		System.out.println("----------------");
		System.out.println("Sinh vien 1 co mssv "+sinhvien1.getMaSinhVien()+" dau "+sinhvien1.kiemTraTrungTuyen());
		System.out.println("Sinh vien 2 co mssv "+sinhvien2.getMaSinhVien()+" dau "+sinhvien2.kiemTraTrungTuyen());
		System.out.println("Sinh vien 3 co mssv "+sinhvien3.getMaSinhVien()+" dau "+sinhvien3.kiemTraTrungTuyen());
		System.out.println("----------------");
		System.out.println("Sinh Vien 1 co trung ngay sinh voi sinh vien 2 khong "+sinhvien1.kiemTraNgaySinhTrungNhau(sinhvien2));
		System.out.println("Sinh Vien 1 co trung ngay sinh voi sinh vien 3 khong "+sinhvien1.kiemTraNgaySinhTrungNhau(sinhvien3));
		System.out.println("Sinh Vien 2 co trung ngay sinh voi sinh vien 3 khong "+sinhvien2.kiemTraNgaySinhTrungNhau(sinhvien3));
		
	}
}
