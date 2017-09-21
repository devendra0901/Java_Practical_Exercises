import java.util.Scanner;

public class Pe6 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int n = reader.nextInt();
		int min, max;
		double avg;
		int[] grades = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter grade for student " + (i + 1) + " : ");
			int m = reader.nextInt();
			if (m >= 0 && m <= 100) {
				grades[i] = m;
				continue;
			} else {
				System.out.println("Please enter valid grade(in range[0,100]) : ");
				m = reader.nextInt();
				grades[i] = m;
			}
		}

		System.out.println("The average is " + getAvg(grades));
		System.out.println("The minimum is " + getMin(grades));
		System.out.println("The maximum is " + getMax(grades));

	}

	public static int getMax(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	public static double getAvg(int[] array) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / (array.length);
		return avg;
	}

}
