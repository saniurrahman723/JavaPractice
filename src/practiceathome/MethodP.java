package practiceathome;

public class MethodP {
	public static void main(String[] args) {
		welcome();
		multiply(32,5);
		multiply(10,5);
		divide(120,20);
	}

	static void welcome() {
		System.out.println("Welcome to out calculator");
	}
	static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	static void divide(int a, int b) {
		System.out.println(a/b);
	}
}



