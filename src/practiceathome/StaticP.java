package practiceathome;

public class StaticP {
	public static void main(String[] args) {

		// Static method: Class Itself
		sayHi();
		//Pancake();
		// Non Static method: Instance of Class
		StaticP m = new StaticP();
		m.sayPancake();
	}

	static void sayHi() {
		System.out.println("Hi");
	}

	void sayPancake() {
		System.out.println("Pancake");
	}
}
