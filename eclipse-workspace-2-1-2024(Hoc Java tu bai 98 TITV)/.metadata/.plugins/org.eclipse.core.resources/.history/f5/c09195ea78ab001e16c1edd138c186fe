package model;

import java.util.Date;
import java.util.Objects;

public class ThiSinh {
		private int maThiSinh;
		private String tenThiSinh;
		private Tinh queQuan;
		private Date ngaySinh;
		private boolean gioiTinh;
		private float diemMon1,diemMon2,diemMon3;
		
		public ThiSinh() {
		}

		public ThiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemMon1,
				float diemMon2, float diemMon3) {
			this.maThiSinh = maThiSinh;
			this.tenThiSinh = tenThiSinh;
			this.queQuan = queQuan;
			this.ngaySinh = ngaySinh;
			this.gioiTinh = gioiTinh;
			this.diemMon1 = diemMon1;
			this.diemMon2 = diemMon2;
			this.diemMon3 = diemMon3;
		}

		@Override
		public String toString() {
			return "ThiSinh [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", queQuan=" + queQuan
					+ ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2="
					+ diemMon2 + ", diemMon3=" + diemMon3 + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(diemMon1, diemMon2, diemMon3, gioiTinh, maThiSinh, ngaySinh, queQuan, tenThiSinh);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ThiSinh other = (ThiSinh) obj;
			return Float.floatToIntBits(diemMon1) == Float.floatToIntBits(other.diemMon1)
					&& Float.floatToIntBits(diemMon2) == Float.floatToIntBits(other.diemMon2)
					&& Float.floatToIntBits(diemMon3) == Float.floatToIntBits(other.diemMon3)
					&& gioiTinh == other.gioiTinh && maThiSinh == other.maThiSinh
					&& Objects.equals(ngaySinh, other.ngaySinh) && Objects.equals(queQuan, other.queQuan)
					&& Objects.equals(tenThiSinh, other.tenThiSinh);
		}
		
		
		
		
}
