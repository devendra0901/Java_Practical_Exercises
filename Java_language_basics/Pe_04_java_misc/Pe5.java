import java.util.*;
import java.util.regex.*;

public class Pe5 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("Enter sentence : ");
		String str = inp.nextLine();

		Pattern p = Pattern.compile("(?i)Harry");

		Matcher m = p.matcher(str);

		System.out.print("Is Harry here ? ");
		if (m.find()) {
			System.out.print(true);
		} else
			System.out.print(false);

		inp.close();
	}
}
