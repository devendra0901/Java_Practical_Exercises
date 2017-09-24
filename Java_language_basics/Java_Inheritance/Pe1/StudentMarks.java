import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int numOfStudents;
		System.out.println("Enter number of Students :");
		numOfStudents = inp.nextInt();
		int[] stugrades = new int[numOfStudents];

		for (int i = 0; i < numOfStudents; i++) {

			System.out.println("Enter grade for student " + (i + 1) + " : ");
			int m = inp.nextInt();
			if (m >= 0 && m <= 100) {
				stugrades[i] = m;
				continue;
			} else {
				System.out.println("Please enter valid grade(in range[0,100]) : ");
				m = inp.nextInt();
				stugrades[i] = m;
			}
		}

		addMatrix();
		// inp.close();
	}

	public static void addMatrix() {

		Scanner inp = new Scanner(System.in);
		int m, n;
		System.out.println("Enter number of rows of matrix :");
		m = inp.nextInt();
		System.out.println("Enter number of columns of matrix :");
		n = inp.nextInt();
		int[][] mat1 = new int[m][n];
		int[][] mat2 = new int[m][n];
		int[][] sum = new int[m][n];
		System.out.println("Enter elements of First Matrix : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat1[i][j] = inp.nextInt();
			}
		}
		System.out.println("Enter elements of Second Matrix : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat2[i][j] = inp.nextInt();
			}
		}
		System.out.println("Sum of the Matrices : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(sum[i][j] + "  ");
			}
			System.out.println();
		}
		// inp.close();
	}

}

