import java.util.HashMap;
import java.io.*;

public class Pe10 {

	public static void main(String[] args) throws IOException {

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		String[] words = null;

		BufferedReader fr = new BufferedReader(new InputStreamReader(
				new FileInputStream("/home/devendra/Desktop/spring/stackroute/myFirstProject/bin/input.txt"), "ASCII"));
		while (true) {
			String line = fr.readLine();
			if (line == null)
				break;

			words = line.split(" ");
			for (int i = 0; i < words.length; i++) {
				String word = words[i];

				if (!h.containsKey(word)) {

					h.put(word, 1);
				} else {
					int k = (int) h.get(word);
					h.put(word, k + 1);
				}
			}

		}

		fr.close();

		System.out.println(h.entrySet());

	}

}

