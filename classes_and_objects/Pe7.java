public class Pe7 {

	public static void main(String[] args) {

		int n = 1, f = 1;
		System.out.println("Int Factorials :");
		System.out.println("The factorial of 0 is 1");

		while (f > 0) {
			f = f * n;
			if (f > 0){
				System.out.println("The factorial of " + n + " is " + f);
				n++;
			}
		System.out.println("The factorial of " + n + " is out of range ");
		}

	}

}
