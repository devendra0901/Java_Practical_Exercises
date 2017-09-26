import java.util.*;

public class Pe2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		String s = "one one -one___two,,three,one @three*one?two";

		// String message = s.replaceAll("[^A-Za-z]+", " ");
		String[] str = s.split("[^A-Za-z]+");

		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				int val = map.get(str[i]);
				map.put(str[i], val + 1);
			} else {
				map.put(str[i], 1);
			}
		}

		System.out.println(map.entrySet());
	}
}
