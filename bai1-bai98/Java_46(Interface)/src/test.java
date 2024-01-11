
public class test {
	public static void main(String[] args) {
		System.out.println("Test");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();
		
		System.out.println(mvn500.chia(4, 0));
		
		sapXepChon ssc = new sapXepChon();
		SapXepChen ssch = new SapXepChen();
		double[] a = {3.5,5,1,5.8,83,4};
		ssch.sapXepTang(a);
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		};
		
	}
}
