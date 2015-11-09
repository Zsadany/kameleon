package enumeration;

import java.util.HashMap;
import java.util.Map;

public class SimpleEnumUse {
	
	public static void main(String... args) {
		howHot();
		getSpicinessWithOrdinal();
	}

	//why do I have to use these methods with static?
	private static void howHot() {
		Spiciness spiciness = Spiciness.MEDIUM;
		System.out.println(spiciness);
	}
	
	private static Map<Spiciness, Integer> getSpicinessWithOrdinal() {
	    Map<Spiciness, Integer> map = new HashMap<Spiciness, Integer>();
		for(Spiciness s : Spiciness.values()) {
			map.put(s, s.ordinal());
		}
		System.out.println(map);
		return map;
	}
}
