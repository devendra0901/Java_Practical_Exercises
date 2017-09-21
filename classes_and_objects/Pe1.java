import java.util.Scanner;

public class Pe1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = reader.next();
		reverse(str);
	}

	public static void reverse(String s) {
		int l = s.length();
		String rev = "";

		for (int i = l - 1; i >= 0; i--)
			rev = rev + s.charAt(i);
		System.out.println("Reverse : " + rev);
		if (s.equals(rev)) {
			System.out.println(s + " is a palindrome");

		} else
			System.out.println(s + " is not a palindrome");

	}
}
