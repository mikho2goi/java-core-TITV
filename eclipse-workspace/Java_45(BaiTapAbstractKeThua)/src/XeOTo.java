
public class XeOTo extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOTo( String loaiNhienLieu, HangSanXuat hangSanXuat) {
		super("OTo", hangSanXuat);
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
		return 80;
	}
	
	
	
}