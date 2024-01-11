import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		int[] mang1 = {1,2,3};
		//copy mang
		
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		
		System.out.println("mang 1"+Arrays.toString(mang1));
		System.out.println("mang 1a"+Arrays.toString(mang1_a));
		System.out.println("---------------");
		// copy = cach 2 dùng hàm clone
		
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 50;
		System.out.println("mang 1b"+Arrays.toString(mang1_b));
		System.out.println("mang 1"+Arrays.toString(mang1));
		// copy mang cach 3 System.arraycopy
		System.out.println("---------------"); 
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0 , mang1_c, 0, mang1.length);
		
		mang1_c[0] = 90;
		System.out.println("Mang1_c"+ Arrays.toString(mang1_c));
		System.out.println("Mang1"+ Arrays.toString(mang1));
		
	}
}
