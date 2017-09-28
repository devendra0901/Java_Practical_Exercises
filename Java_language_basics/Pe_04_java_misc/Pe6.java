import java.util.*;
import java.util.regex.*;

public class Pe6 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter sentence : ");
		String str = inp.nextLine();

		System.out.print("Enter word to be found : ");
		String word = inp.next();

		Pattern p = Pattern.compile(word);

		Matcher m = p.matcher(str);

		while (m.find()) {
			System.out.println("Found at : " + m.start() + " - " + m.end());
		}

		inp.close();
	}
}
