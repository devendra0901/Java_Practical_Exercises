package myFirstProject;

import java.util.Scanner;

public class Pe6 {

	public static void main(String[] args) {
		LambdaDemo lambdaDemo = (n) -> {
			return (2 * n);
		};
		System.out.print("Enter the number : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Result : " + lambdaDemo.multiplyBy2(n));
	}

}
