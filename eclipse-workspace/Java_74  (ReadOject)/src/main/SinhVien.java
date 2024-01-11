package main;

import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable {
	private String maSinhVien,hoVaTen;
	private int namSinh;
	private float diemTB;
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTB) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diemTB, hoVaTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SinhVien other = (SinhVien) obj;
		return  Objects.equals(maSinhVien, other.maSinhVien) ;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB="
				+ diemTB + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
	
}
