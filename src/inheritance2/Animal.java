package inheritance2;

public class Animal {
	
	static void legs() {
		System.out.println("Four Legs");
	}
	static void tail() {
		System.out.println("One tail");
	}
	static void run() {
		System.out.println("can run fast");
	}
	public static void main(String[] args) {
		
		Cat c = new Cat();
		Dog d = new Dog();
		Horse h = new Horse();
		
		System.out.println("Cat Description:");
		c.eat();
		c.eye();
		c.legs();
		c.run();
		c.size();
		c.tail();
		System.out.println("--------------------");
		
		System.out.println("Dog Description:");
		d.eat();
		d.eye();
		d.legs();
		d.run();
		d.size();
		d.tail();
		System.out.println("--------------------");
		
		System.out.println("Horse Description:");
		h.eat();
		h.eye();
		h.legs();
		h.run();
		h.size();
		h.tail();
		System.out.println("--------------------");
		
	}
}

