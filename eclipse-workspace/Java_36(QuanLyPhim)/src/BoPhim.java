
public class BoPhim {
	private String tenPhim;
	private double giaVe;
	private int namSanXuat;
	private	HangSanXuat hangSanXuat;
	private	NgayChieu ngayChieu;
	
	
	
	public BoPhim(String tenPhim, double giaVe, int namSanXuat, HangSanXuat hangSanXuat, NgayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.giaVe = giaVe;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.ngayChieu = ngayChieu;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	
	public double getGiaVe() {
		return giaVe;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	
	
// Hàm kiểm tra giá vé của 1 phim bất kì có rẻ hơn phim khác hong
	
	public boolean soSanhGiave(BoPhim phimkhac) {
		return this.giaVe < phimkhac.giaVe;
	}
// Hàm trả về tên hãng
	public String tenHang(){
		return hangSanXuat.getTenHang();
	}
	
// Hàm trả về giá sau khi giảm giá
	
	public double giaSauKhiGiam(double x) {
		return this.giaVe - (x*this.giaVe)/100;
	}
	
}
