

public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private TacGia tacGia;
	
	public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	
	public void inTenSach() {
		System.out.println(this.tenSach);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + namXuatBan;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		if (namXuatBan != other.namXuatBan)
			return false;
		return true;
	}
	
	public double giaSauKhiGiam(double x) {
		double giaBanSauKhiGiam;
		double giaTruocKhiGiam = this.giaBan;
		giaBanSauKhiGiam = giaTruocKhiGiam - (x*this.giaBan)/100;
		return giaBanSauKhiGiam;
	}

	
}
