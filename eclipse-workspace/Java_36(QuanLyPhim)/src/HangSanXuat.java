

public class HangSanXuat {
	private String tenHang;
	private String quocGia;
	
	
	
	public HangSanXuat(String tenHang, String quocGia) {
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}
	
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	
	public String getQuocGia() {
		return quocGia;
	}
	public String getTenHang() {
		return tenHang;
	}
}
