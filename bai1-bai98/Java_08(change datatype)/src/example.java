import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap tuoi cua ban");
		int tuoi = sc.nextInt();
		String ketqua = (tuoi >= 18) ? "Du Tuoi" : "Chua du tuoi";
		System.out.println(ketqua);
	}
}
