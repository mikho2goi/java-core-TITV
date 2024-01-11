package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 500000;
		Scanner sc = new Scanner(System.in);
		Locale lc = new Locale("en","US");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		int luaChon = 1;
		do {
			System.out.println("");
			System.out.println("------------Mời Bạn Lựa Chọn-------------");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn (Phím bất kì) để thoát.");
			luaChon = sc.nextInt();
			
			if (luaChon == 1) {
				// Đặt cược
				System.out.println("****BẮT ĐẦU CHƠI: ");
				double datcuoc;
				do {
					System.out.println("Số Tiền Hiện Có "+numf.format(taiKhoanNguoiChoi));
					System.out.println(
							"***** Đặt cược (0< số tiền cược <= " + numf.format(taiKhoanNguoiChoi)+" )"+ "Bạn muốn cược bao nhiêu");
					datcuoc = sc.nextDouble();
				} while (datcuoc <= 0 || datcuoc > taiKhoanNguoiChoi);

				// lựa chọn cuộc đời

				int luaChonTaiXiu = 0;
				do {
					System.out.println("**** Chon: 1 <-> tài Hoặc 2 <-> Xỉu");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				//Tung xúc xắc
				Random xucXac1 = new Random();
				Random xucXac2= new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(6)+1;
				int giaTri2 = xucXac2.nextInt(6)+1;
				int giaTri3 = xucXac3.nextInt(6)+1;
				int tong = giaTri1 +giaTri2 +giaTri3; 
				//Tính toán kết quả
				System.out.println("*******Kết quả: "+giaTri1+"-"+giaTri2+"-"+giaTri3);
				
				if(tong == 3 || tong == 18) {
					System.out.println("*******Bão");
					System.out.println("*****Bạn Đã Thua");
					taiKhoanNguoiChoi -= datcuoc;
					System.out.println("**********Số tiền còn lại "+numf.format(taiKhoanNguoiChoi));
				}else if(tong >= 4 && tong<= 10 ) {
					System.out.println("*****Xĩu");
					if(luaChonTaiXiu == 2) {
						System.out.println("******Bạn thắng");
						taiKhoanNguoiChoi += datcuoc;
						System.out.println("***Số tiền còn lại "+numf.format(taiKhoanNguoiChoi));
					}else {
						System.out.println("*****Bạn Đã Thua");
						taiKhoanNguoiChoi -= datcuoc;
						System.out.println("**********Số tiền còn lại "+numf.format(taiKhoanNguoiChoi));
					}
				}
				else {
					System.out.println("*****Tài");
					if(luaChonTaiXiu == 1) {
						System.out.println("******Bạn thắng");
						taiKhoanNguoiChoi += datcuoc;
						System.out.println("***Số tiền còn lại "+numf.format(taiKhoanNguoiChoi));
					}else {
						System.out.println("*****Bạn Đã Thua");
						taiKhoanNguoiChoi -= datcuoc;
						System.out.println("**********Số tiền còn lại "+numf.format(taiKhoanNguoiChoi));
					}
				}
					
			}
		} while (luaChon == 1  );
	}
}
