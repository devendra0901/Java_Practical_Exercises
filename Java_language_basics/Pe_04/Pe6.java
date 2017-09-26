import java.util.*;

public class Pe6 {

	public static void main(String[] args) {

		String[] str = { "Harry", "Olive", "Alice", "Bluto", "Eugene" };

		SortedSet<String> setA = new TreeSet<String>();

		for (int i = 0; i < str.length; i++) {
			setA.add(str[i]);
		}
		System.out.println("Sorted Set : " + setA);

		ArrayList<String> list = new ArrayList<String>();

		Iterator<String> it = setA.iterator();

		while (it.hasNext()) {
			list.add(it.next());
		}

		System.out.println("Array list from Set : " + list);
	}
}

