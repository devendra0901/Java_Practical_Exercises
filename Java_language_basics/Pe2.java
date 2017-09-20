import java.util.Scanner;

public class Pe2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();

		if (n > 20 && n < 30) {
			if (n % 2 == 0)
				System.out.println("Jerry");
			else
				System.out.println("Tom ");

		}

	}

}

