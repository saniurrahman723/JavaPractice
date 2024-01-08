package practiceathome;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {
	public static void main(String[] args) {


		List<String> list = new ArrayList();
		list.add("Z");
		list.add("A");
		list.add("M");
		System.out.println(list);

		list.remove("Z");
		for(String value : list) {
			System.out.println(value);
		}

	}


}

