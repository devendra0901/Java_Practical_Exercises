import java.util.Scanner;

public class Pe10 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String str = reader.next();
		System.out.println("Enter an integer : ");
		int n = reader.nextInt();

		int l = str.length();
		String newStr = str;

		for (int j = 1; j <= n; j++) {
			for (int i = l - n; i < l; i++) {
				newStr = newStr + str.charAt(i);
			}
		}
		System.out.println("Required Output : " + newStr);

	}

}
