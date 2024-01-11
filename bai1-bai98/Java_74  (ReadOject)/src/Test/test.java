package Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon;
		do {
			System.out.println("			------MENU--------");
			System.out.println("1.		Thêm sinh viên.\n"
					+ "2.		In Danh Sách Sinh Viên.\n"
					+ "3.		Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.		Lấy số lượng sinh viên trong danh sách.\n"
					+ "5.		Làm rỗng danh sách sinh viên.\n"
					+ "6. 		Kiểm tra sinh viên có tồn tại không dựa trên mã sinh viên.\n"
					+ "7. 		Xóa sinh viên dựa trên mã sinh viên.\n"
					+ "8. 		Tìm sinh viên dựa trên tên.\n"
					+ "9. 		Xuất ra màn hình danh sách sinh viên điểm từ cao đến thấp.\n"
					+ "10. 		Lưu danh sách sinh viên xuống tập tin.\n"
					+ "11. 		Đọc danh sách sinh viên xuống tập tin.\n"
					+ "0. 	Thoát khỏi chương trình.\n");
			luaChon = sc.nextInt();
			sc.nextLine();    
			if(luaChon == 1) {
				// 1. thêm danh sách sinh viên
				System.out.println("Nhập Mã Sinh Viên: ");String mssv = sc.nextLine();
				System.out.println("Nhập Họ Và Tên: ");String hoTen = sc.nextLine();
				System.out.println("Nhập Năm Sinh: ");int namSinh = sc.nextInt();
				System.out.println("Nhập Điểm Trung Bình: ");float diemTB = sc.nextFloat();
				System.out.println("Sinh Viên Đã Được Thêm !");
				SinhVien sv = new SinhVien(mssv, hoTen, namSinh, diemTB);
				dssv.themSinhvien(sv);
			}else if(luaChon == 2) {
				dssv.inDanhSachSinhVien();
			}else if(luaChon == 3) {
				System.out.println("Danh sách rỗng: "+dssv.kiemTraDanhSachRong()); 
			}else if(luaChon == 4) {
				System.out.println("Số lượng sinh viên hiện tại: "+dssv.laySoLuongSinhVien()); 
			}else if(luaChon == 5) {
				dssv.lamRongDanhSach();
				System.out.println("Đã làm rỗng danh sách !");
			}else if(luaChon == 6) {
				// 6. Kiểm tra sinh viên có tồn tại hay không, dựa trên mã sinh viên
			
				System.out.println("Nhập mã Sinh Viên: ");String maSinhVien = sc.nextLine();
				SinhVien sv1 = new SinhVien(maSinhVien);
				System.out.println("Kiểm tra Sinh Viên có tồn tại: "+dssv.kiemTraTonTai(sv1));
			
			}else if(luaChon == 7) {
				// 7 Kiểm tra sinh viên có tồn tại hay không, dựa trên mã sinh viên
				System.out.println("Nhập mã Sinh Viên: ");String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xóa Sinh Viên Thành Công!");
			}else if (luaChon == 8) {
				//8 Tìm sinh viên theo tên đã nhập từ bàn phím
				System.out.println("Nhập họ tên cần tìm ");String hoVaTen = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssv.timKiemSinhVien(hoVaTen);
			}else if (luaChon == 9) {
				System.out.println("Danh sách sinh viên từ điểm cao đến thấp");
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			}else if (luaChon == 10) {
				System.out.println("Nhập tên file: ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				try {
					dssv.ghiDuLieuXuong(f);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else if (luaChon == 11) {
			System.out.println("Nhập tên file: ");
			String tenFile = sc.nextLine();
			File f = new File(tenFile);
			dssv.docDuLieuLen(f);;
		}
			
		}while( luaChon != 0);
	}
}
