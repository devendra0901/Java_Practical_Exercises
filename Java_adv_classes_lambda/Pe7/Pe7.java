package myFirstProject;

import java.util.Scanner;

public class Pe7 {
	public static void main(String[] args) {
		IsFactor isFactor = (n, i) -> {
			if ((n % i) == 0)
				return true;
			else
				return false;
		};

		System.out.println("Enter two numbers : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = input.nextInt();
		if (isFactor.factor(n, i))
			System.out.println(i + " is a factor of " + n);
		else
			System.out.println(i + " is not a factor of " + n);

	}
}

