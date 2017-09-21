public class Pe8 {

	public static void main(String[] args) {

		longFactorial();

	}

	public static void longFactorial() {

		int n = 1;
		long f = 1;
		System.out.println("Long Factorials :");
		System.out.println("The factorial of 0 is 1");

		while (f > 0) {
			f = f * n;
			if (f > 0) {
				System.out.println("The factorial of " + n + " is " + f);
				n++;
			}

		}
		System.out.println("The factorial of " + n + " is out of range ");
	}

}
