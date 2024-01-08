package practiceathome;

import java.util.HashMap;
import java.util.Map;

import inhertance.main;

public class JavaMap {
public static void main(String[] args) {
	Map<Integer, String> bdcricket = new HashMap<Integer, String>();
	bdcricket.put(1, "Liton Das");
	bdcricket.put(2, "Shanto");
	bdcricket.put(3, "Shakib");
	bdcricket.put(4, "Mushfiq");
	bdcricket.put(5, "Mahedi");
	bdcricket.put(6, "Mahmudullah");
	bdcricket.put(7, "Mustafizur");
	bdcricket.put(8, "Taskin");
	System.out.println(bdcricket);
	
	System.out.println("-------------------------");
	
	for(Map.Entry m: bdcricket.entrySet()){
		System.out.println(m.getKey() + " " + m.getValue());
	}
}
}
