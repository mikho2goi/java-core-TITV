package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tuDien {
	private Map<String, String> data = new TreeMap<>();
	
	public void themTuDien(String tuKhoa, String yNghia) {
		 this.data.put(tuKhoa,yNghia );
	}
	
	public void xoaTu(String tuKhoa) {
		this.data.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa) {
		return this.data.get(tuKhoa);
	}
	
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.data.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	public int laySoLuong() {
		return this.data.size();
	}
	public void xoaTatCa() {
		 this.data.clear();
	}
	public static void main(String[] args) {
		tuDien td = new tuDien();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------------");
			System.out.println("Từ điển Anh - Việt");
			System.out.println("1. Thêm Từ (Từ Khóa, Ý Nghĩa)");
			System.out.println("2. Xóa Từ (Từ Khóa)");
			System.out.println("3. Tìm ý nghĩa của từ( Bằng từ khóa)");
			System.out.println("4. In danh sách từ khóa");
			System.out.println("5. In số lượng từ khóa trong hệ thống ");
			System.out.println("6. Xóa Tất cả các từ khóa");
			System.out.println("0. Dừng chương trình");
			System.out.println("-----------------");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1) {
				System.out.println("Nhập từ khóa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhập ý nghĩa: ");
				String yNghia = sc.nextLine();
				 td.themTuDien(tuKhoa, yNghia);
			}else if (luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập từ khóa cần thao tác");
				String tuKhoa = sc.nextLine();
				
				if (luaChon == 2) {
					System.out.println("Xóa Thành Công !");
					td.xoaTu(tuKhoa);
				}else {
					System.out.println("Có ý Nghĩa là: "+td.traTu(tuKhoa));	
				}
			}else if (luaChon == 4) {
				td.inTuKhoa();
			}else if (luaChon == 5) {
				System.out.println(td.laySoLuong()); 
			}else if (luaChon == 6) {
				td.xoaTatCa();
				System.out.println("Đã Xóa Tất Cả từ trong hệ thống");
			}
			
		} while (luaChon != 0);
	
	}
}




