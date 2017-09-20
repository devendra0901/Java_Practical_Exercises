import java.util.Scanner;

public class Pe4 {

	public static void main(String[] args) {

		int p = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of iterations : ");
		int n = reader.nextInt();

		System.out.print("Pattern : ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
		}
	}
}
