import java.util.Scanner;

public class Pe5 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter 7 numbers :");
		String str = inp.nextLine();
		String[] num = str.split(" ");
		int[] numArr = new int[7];
		for (int i = 0; i < 7; i++) {
			numArr[i] = Integer.parseInt(num[i]);
		}
		int p = 1, d;
		for (int i = 1; i < 7; i++) {
			d = Math.abs(numArr[i] - numArr[i - 1]);
			if (d == 1)

				continue;
			else {

				p = 0;
				break;
			}

		}

		if (p == 1) {
			System.out.println(str + " are consecutive numbers ");
		} else {
			System.out.println(str + " are non-consecutive numbers ");
		}
	}
}

