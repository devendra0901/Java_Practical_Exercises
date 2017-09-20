import java.util.Scanner;

public class Pe3 {

	public static void main(String[] args) {

		int p = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter word : ");
		String str = reader.next();

		for (int i = 0; i < str.length(); i++) {
			p=0;
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				p++;
			}
			if (p == 1)
				System.out.print(ch + " - vowel, ");
			else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.print(ch + " - consonant, ");
			else
				System.out.print(ch + " - not an alphabet,");
		}

	}

}

