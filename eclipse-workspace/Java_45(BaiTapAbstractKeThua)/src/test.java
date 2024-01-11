
public class test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang 1", "Viet Nam");
		HangSanXuat h2 = new HangSanXuat("Hang 2", "USA");
		HangSanXuat h3 = new HangSanXuat("Hang 3", "JAV");
		
		PhuongTienDiChuyen p1 = new MayBay("Xang",h1);
		PhuongTienDiChuyen p2 = new XeOTo("Xang", h2);
		PhuongTienDiChuyen p3 = new XeDap( h3);
		
		System.out.println("Lay Hang San Xuat");
		System.out.println("P1 " +p1.layTenHangSanXuat());
		System.out.println();
		System.out.println(p2.layVanToc());
	}
}
