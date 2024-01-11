
public class SinhVien {
		private	String maSinhVien,tenSinhVien;
		private Ngay ngaySinh;
		private double diemTb;
		private Lop lop;
		
		public SinhVien(String maSinhVien, String tenSinhVien, Ngay ngaySinh, double d,Lop lop) {
			this.maSinhVien = maSinhVien;
			this.tenSinhVien = tenSinhVien;
			this.ngaySinh = ngaySinh;
			this.diemTb = d;
			this.lop = lop;
		}

		public String getMaSinhVien() {
			return maSinhVien;
		}

		public void setMaSinhVien(String maSinhVien) {
			this.maSinhVien = maSinhVien;
		}

		public String getTenSinhVien() {
			return tenSinhVien;
		}

		public void setTenSinhVien(String tenSinhVien) {
			this.tenSinhVien = tenSinhVien;
		}

		public Ngay getNgaySinh() {
			return ngaySinh;
		}

		public void setNgaySinh(Ngay ngaySinh) {
			this.ngaySinh = ngaySinh;
		}

		public double getDiemTb() {
			return diemTb;
		}

		public void setDiemTb(float diemTb) {
			this.diemTb = diemTb;
		}
		
// ham in ten khoa
		public void inTenKhoa() {
			System.out.println(this.lop.getTenKhoa());
		}
// ham kiem tra dau hay rot
		
		public boolean kiemTraTrungTuyen() {
		return this.diemTb>5.0;
		}
// ham kiem tra ngay sinh trung nhau
		
		public boolean kiemTraNgaySinhTrungNhau(SinhVien sinhVien){
			return this.ngaySinh.equals(sinhVien.ngaySinh);
		}

	
		
}
