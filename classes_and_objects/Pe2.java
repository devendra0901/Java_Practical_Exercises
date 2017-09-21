import java.util.Scanner;

public class Pe2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double n = reader.nextDouble();
		powerOfFour(n);
	}

	public static void powerOfFour(double n) {
		double d = Math.log(n) / Math.log(4);
		double d1 = Math.floor(d);
		if (d == d1)
			System.out.println((int) n + " is a power of 4");
		else
			System.out.println((int) n + " is not a power of 4");

	}
}
