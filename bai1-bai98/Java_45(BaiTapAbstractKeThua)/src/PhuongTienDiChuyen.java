
public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat;
	
	
	public PhuongTienDiChuyen(String loaiPhuongTien,HangSanXuat hangSanXuat) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	public String layTenHangSanXuat() {
			return this.hangSanXuat.getTenHangSanXuat();
	}
	public void batDau() {
		System.out.println("Start");
	}
	public void tangToc() {
		System.out.println("Tang Toc");
	}
	
	public void dungLai() {
		System.out.println("Stop");
	}
	public abstract double layVanToc();
	
	
	
}
