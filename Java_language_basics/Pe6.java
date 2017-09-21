import java.util.Scanner;

public class Pe6 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a character : ");

		char ch = reader.next().charAt(0);

		if (ch >= 97 && ch <= 123) {
			System.out.println("Small Letter");
		} else if (ch >= 65 && ch <= 96) {
			System.out.println("Capital Letter");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("Digit");
		} else {
			System.out.println("Special Symbol");
		}

	}
}
