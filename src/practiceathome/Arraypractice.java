package practiceathome;

import java.util.ArrayList;

public class Arraypractice {
	public static void main(String[] args) {

		String Arrayname[]= {"United States", "China", "India", "Brazil", "Australia", "Canada", "Germany", "Japan"};
		for(int i=0; i<Arrayname.length; i++) {
			System.out.println(Arrayname[i]);
		}
		System.out.println("********************");
		for(String name :Arrayname) {
			System.out.println(name);
		}
		System.out.println("********************");
		
		ArrayList fruitlist = new ArrayList();
		
		fruitlist.add("Mango");
		fruitlist.add("Bannana");
		fruitlist.add("Apple");
		fruitlist.add("Strawberry");
		fruitlist.add("Watermelon");
		fruitlist.add("Grape");
		fruitlist.add("Orange");
		System.out.println(fruitlist);
	}

}


