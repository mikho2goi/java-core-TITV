package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	// 1. Thêm sinh viên vào danh sách
	public void themSinhvien(SinhVien sv) {
			this.danhSach.add(sv);
	}
	// 2. in danh sách sinh viên
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	//3 kiểm tra danh sách sinh viên có rỗng không
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}
	//4 Lấy ra số lượng danh sách
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}
	//5 làm rỗng danh sách sinh viên
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
	// 6 Kiểm tra sinh viên có tồn tại hay không, dựa trên mã sinh viên
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	
	//7 xóa sinh viên khỏi danh sách
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
	
	//8 tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím
	public void timKiemSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}


	//9 Xuất ra màn hình danh sách sinh viên theo điểm
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if(o1.getDiemTB()>o2.getDiemTB()) {
					return -1;
				}else if(o1.getDiemTB()<o2.getDiemTB()) {
					return 1;
				}
				return 0;
			}
		});
	}
	//10 Ghi đối tượng xuống file
	
	public void ghiDuLieuXuong(File file) throws IOException {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		for (SinhVien sinhVien : danhSach) {
			oos.writeObject(sinhVien);
		}
		
		oos.flush();
		oos.close();
		
		
		
		
		
	}
	
	
}
