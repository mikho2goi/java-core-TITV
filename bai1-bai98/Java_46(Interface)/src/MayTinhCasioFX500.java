
public class MayTinhCasioFX500 implements MayTinhBoTui {

	@Override
	public double cong(double a, double b) {
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		try {
			b = 0;
		} catch (Exception e) {
			System.out.println(" du lieu sai");
		}
		return a/b;
	}
		
}
