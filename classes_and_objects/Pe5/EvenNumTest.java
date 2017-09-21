import java.util.Scanner;

public class EvenNumTest {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		boolean p = false;
		p = isEven(n);

		if (p)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd ");

	}

	public static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		return false;
	}

}

