package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_TreeSet {
	Set<String> thungPhieuDuThuong = new TreeSet<String>();

	public RutThamTrungThuong_TreeSet() {
	}

	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}

	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}

	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}

	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}

	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}

	public String rutMotPhieu() {
		Random r = new Random();
		int viTri = r.nextInt(this.thungPhieuDuThuong.size());
		return (String) this.thungPhieuDuThuong.toArray()[viTri];
	}
	public void inCacMaThamGia() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
		do {
			System.out.println("-------------------------");
			System.out.println("MENU");
			System.out.println("1. Thêm mã số dự thưởng");
			System.out.println("2. Xóa mã số dự thưởng");
			System.out.println("3. Kiểm tra tồn tại mã số dự thưởng");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng");
			System.out.println("5. Số lượng phiếu dự thưởng");
			System.out.println("6. Rút thăm trúng thưởng");
			System.out.println("7. In ra các thăm trúng thưởng");
			System.out.println("0. Kết thúc chuong trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập vào mã phiếu dự thưởng");
				String giaTri = sc.nextLine();
				
				if(luaChon == 1) {
					System.out.println("Thêm phiếu thành công! ");	rt.themPhieu(giaTri);
				}else if(luaChon == 2) {
					System.out.println("Xóa phiếu thành công!"); rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Kết quả kiểm tra: "+rt.kiemTraPhieuTonTai(giaTri));	
				}
			}else if (luaChon == 4) {
				System.out.println("Đã xóa tất cả các phiếu dự thưởng!"); rt.xoaTatCaPhieuDuThuong();
			}else if (luaChon == 5) {
				System.out.println("Số lượng phiếu dự thưởng là: "+rt.laySoLuong()); 
			}else if (luaChon == 6) {
				System.out.println("Mã số trúng thưởng 100 triệu đồng là: "+ rt.rutMotPhieu());
			}
			else if (luaChon == 7) {
				System.out.println("Các mã tham gia dự thưởng bao gồm: ");	rt.inCacMaThamGia();
			}
		}while(luaChon!=0);
}}
