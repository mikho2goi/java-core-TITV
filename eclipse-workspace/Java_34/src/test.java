
public class test {
	
	public static void main(String[] args) {
		MyDate md = new MyDate(30, 7, 2002);
		MyDate md2 = new MyDate(30, 7,  2002);
		MyDate md3 = new MyDate(32, 13, 2002);
		
		System.out.println(md);
		System.out.println(md2);
		System.out.println(md3);
		
		System.out.println(md.equals(md2));
		System.out.println(md.equals(md3));
		System.out.println(md2.equals(md3));
		
		System.out.println("Hashcode md " + md.hashCode());
		System.out.println("Hashcode md " + md2.hashCode());
		System.out.println("Hashcode md " + md3.hashCode());

	}
}
