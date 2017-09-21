import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pe7 {

	public static void main(String[] args) {

		int sum = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number : ");

		String str = reader.next();

		Integer[] intArray = new Integer[str.length()];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int d = Character.getNumericValue(c);
			intArray[i] = d;
			if ((d % 2) == 0)
				sum += d;
		}

		Arrays.sort(intArray, Collections.reverseOrder());

		System.out.print("Sorted number in non-increasing order : ");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(intArray[i]);
		}
		System.out.println();
		System.out.println("Sum of even numbers :" + sum);
		if (sum > 15)
			System.out.println("true");
		else
			System.out.println("false");

	}
}
