import java.util.Scanner;

public class Pe8 {

	public static void main(String[] args) {

		int target = 30, n;
		Scanner reader = new Scanner(System.in);
		System.out.println("Guess a number in range(1,50): ");

		while ((n = reader.nextInt()) != target) {
			if (n > target) {
				System.out.println("Number guessed is more than the original number. Please retry :");
			} else
				System.out.println("Number guessed is less than the original number. Please retry :");
		}

		System.out.println("You guessed correctly!!!!");

	}

}
