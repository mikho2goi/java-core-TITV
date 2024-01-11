
public class test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(10, 2, 2012);
		Ngay ngay2 = new Ngay(20, 5, 2014);
		Ngay ngay3 = new Ngay(30, 8, 2023);
	
		QuocGia quocgia1 = new QuocGia("VN", "Viet Nam");
		QuocGia quocgia2 = new QuocGia("UK", "Hoa Ky");
		QuocGia quocgia3 = new QuocGia("US", "Anh");
		
		HangSanXuat hang1 = new HangSanXuat("Hoa Sen", quocgia1);
		HangSanXuat hang2 = new HangSanXuat("Heisenberg", quocgia2);
		HangSanXuat hang3 = new HangSanXuat("Shelby", quocgia3);
		
		MayTinh maytinh1 = new MayTinh(hang1, ngay1, 26000, 9);
		MayTinh maytinh2 = new MayTinh(hang2, ngay2, 66000, 12);
		MayTinh maytinh3 = new MayTinh(hang3, ngay3, 56000, 4);
		
		System.out.println("May Tinh 1 co gia thap hon may tinh 2 "+maytinh1.kiemTraGiaThapHon(maytinh2));
		System.out.println("May Tinh 1 co gia thap hon may tinh 3 "+maytinh1.kiemTraGiaThapHon(maytinh3));
		System.out.println("May Tinh 2 co gia thap hon may tinh 3 "+maytinh2.kiemTraGiaThapHon(maytinh3));
		
		System.out.println("Quoc gia san xuat may tinh 1 la "+maytinh1.getTenQuocGia());
		System.out.println("Quoc gia san xuat may tinh 2 la "+maytinh2.getTenQuocGia());
		System.out.println("Quoc gia san xuat may tinh 3 la "+maytinh3.getTenQuocGia());
		
	}
}
