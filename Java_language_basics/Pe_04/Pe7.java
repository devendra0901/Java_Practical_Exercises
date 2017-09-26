import java.util.*;

public class Pe7 {

	public static void main(String[] args) {

		ArrayList<String> c1 = new ArrayList<String>();

		c1.add("Java");
		c1.add("C");
		c1.add("C++");
		c1.add("Python");
		c1.add("JavaScript");

		ArrayList<String> c2 = new ArrayList<String>();

		c2.add("Java");
		c2.add("Angular");
		c2.add("C++");
		c2.add("JavaScript");

		ArrayList<String> result = new ArrayList<String>();

		for (int i = 0; i < c1.size(); i++) {
			String str = c1.get(i);
			int p = 0;
			for (int j = 0; j < c2.size(); j++) {
				if (str.equals(c2.get(j))) {
					p = 1;
					break;
				} else {
					continue;
				}
			}
			if (p == 1) {
				result.add("Yes");
			} else {
				result.add("No");
			}
		}

		System.out.println(result);
	}

}

