
public class test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		ToaDo td3 = new ToaDo(12, 1);
		
		Hinh h1 = new Diem(td1);
		
		Hinh h2 = new HinhChuNhat(td3, 10, 5);
		
		Hinh h3 = new HinhTron(td2, 10);
		
		System.out.println("DT1 "+h1.tinhDienTich());
		System.out.println("DT2 "+h2.tinhDienTich());
		System.out.println("DT3 "+h3.tinhDienTich());
		
	}
}
