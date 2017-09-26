import java.util.*;

public class Pe3 {

	public static void main(String[] args) {

		String arr[] = { "a", "b", "c", "d", "a", "c", "c" };

		Map<String, Boolean> map = new HashMap<String, Boolean>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], true);
			} else {
				map.put(arr[i], false);
			}
		}
		System.out.println(map.entrySet());
	}

}

