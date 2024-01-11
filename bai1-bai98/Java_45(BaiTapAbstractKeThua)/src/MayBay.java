
public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public MayBay( String loaiNhienLieu,HangSanXuat hangSanXuat) {
		super("May Bay", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 500;
	}
	public void catCanh() {
		System.out.println("Bay");
	}
	public void haCanh() {
		System.out.println("Ha Canh");
	}
	




}
