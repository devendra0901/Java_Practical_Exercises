import java.util.Scanner;

public class Pe9 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String str = reader.next();

		String rev = "";
		int l = str.length();

		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse : " + rev);

	}

}
