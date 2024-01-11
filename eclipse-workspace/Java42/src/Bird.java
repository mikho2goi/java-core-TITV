
public class Bird extends Animal{

	public Bird()  {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("Toi an sau");
	}

	@Override
	public void makeSound() {
		System.out.println("Chip Chip");
	}
	
}
