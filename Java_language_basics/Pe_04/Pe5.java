import java.util.*;

public class Pe5 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter value for key 'val1' : ");
		map.put("val1", inp.next());
		System.out.println("Enter value for key 'val2' : ");
		map.put("val2", inp.next());

		System.out.println("Map object before calling function :" + map.entrySet());

		map = func(map);
		System.out.println("Map object after calling function :" + map.entrySet());
	}

	public static Map<String, String> func(Map<String, String> newMap) {

		if (newMap.get("val1") != null) {
			newMap.put("val2", newMap.get("val1"));
			newMap.put("val1", "");
		}

		return newMap;

	}

}

