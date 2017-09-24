import java.util.Scanner;

public class Pe3 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number of places :");
		int n = inp.nextInt();
		System.out.println("Enter places : ");
		String[] s = new String[n + 1];
		String[] newArr = new String[n];
		for (int i = 0; i <= n; i++) {
			s[i] = inp.nextLine();
		}
		for (int i = 1; i <= n; i++) {
			newArr[i - 1] = Character.toString(s[i].charAt(0));
			for (int j = 1; j < s[i].length(); j++) {
				if (checkVowel(s[i].charAt(j))) {
					continue;
				} else
					newArr[i - 1] = newArr[i - 1] + s[i].charAt(j);

			}
			System.out.println("Place name without vowels : " + i + " " + newArr[i - 1]);
		}

	}

	public static boolean checkVowel(char ch) {
		boolean p = false;
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			p = true;

		}
		return p;

	}

}

