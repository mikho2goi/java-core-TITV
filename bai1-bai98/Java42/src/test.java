
public class test {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.eat();
		d.makeSound();
		d.sleep();
		
		System.out.println("---------");
		Cat c = new Cat();
		c.eat();
		c.makeSound();
		c.sleep();

		System.out.println("---------");
		
		Bird b = new Bird();
		b.eat();
		b.makeSound();
		b.sleep();
		
	}
}
