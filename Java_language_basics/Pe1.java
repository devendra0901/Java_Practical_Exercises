
import java.util.Scanner;

public class Pe1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String str = reader.next();

		// String str = Integer.toString(n);
		String reverse = "";
		int l = str.length();
		int sum=0;

		for (int i = l - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);

		if (str.equals(reverse)) {
			System.out.print(str + " is a palindrome");

			for (int i = 0; i < l; i++) {
				char c = str.charAt(i);
				int d = Character.getNumericValue(c);
				if ((d % 2) == 0)
					sum += d;
			}

			if (sum > 25)
				System.out.println("and sum of even numbers is greater than 25");
			else
				System.out.println("and sum of even numbers is less than 25");

		} else
			System.out.println(str + " is not a palindrome");

	}

}

