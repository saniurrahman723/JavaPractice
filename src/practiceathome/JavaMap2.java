package practiceathome;

import java.util.HashMap;
import java.util.Map;

public class JavaMap2 {

	public static void main(String[] args) {
		
		Map<Integer, String> leakers = new HashMap<Integer, String>();
		
		leakers.put(14, "Colin Castleton");
		leakers.put(10, "Max Christie");
		leakers.put(3, "Anthony Davis");
		leakers.put(17, "Alex Fudge");
		leakers.put(28, "Rui Hachimura");
		//System.out.println(leakers);
		leakers.replace(10, "Mohammad");
		leakers.remove(3, "Anthony Davis");
		leakers.put(23, "Anthony Davis");
		System.out.println("---------------------------");
		
		for(Map.Entry m : leakers.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		

	}

}
