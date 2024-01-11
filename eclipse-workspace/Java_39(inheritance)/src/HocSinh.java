
public class HocSinh extends ConNguoi {
	private String tenLop,tenTruong;

	public HocSinh(String hoTen, int namSinh, String tenLop, String tenTruong) {
		super(hoTen, namSinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	
	public void lambaiTap() {
		System.out.println("..... .....");
	}
}
