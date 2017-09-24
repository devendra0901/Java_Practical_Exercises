public class Pe4 {

	public static void main(String[] args) {

		String white = "WW";
		String black = "BB";
		System.out.println("My Chess Board :");
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if (i % 2 != 0) {
					if (j % 2 != 0)
						System.out.print(white + "|");
					else
						System.out.print(black + "|");

				} else {
					if (j % 2 != 0)
						System.out.print(black + "|");
					else
						System.out.print(white + "|");
				}
			}
			System.out.println();

		}

	}
}

