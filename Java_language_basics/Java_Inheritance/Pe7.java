public class Pe7 {

	public static void f1() throws IndexOutOfBoundsException {

		int[] a = new int[3];
		a[4] = 5;

	}

	public static void f2() throws NegativeArraySizeException {
		int[] b = new int[-4];
		b[3] = 4;
	}

	public static void f3() throws NullPointerException {
		String p = null;
		char q = p.charAt(0);
	}

	public static void main(String[] args) {

		try {
			f2();

		} catch (NegativeArraySizeException e) {
			System.err.println("Caught NegativeArraySizeException");
			e.printStackTrace();
		}

		try {
			f1();
		} catch (IndexOutOfBoundsException e) {

			System.err.println("Caught IndexOutOfBoundsException");
			e.printStackTrace();
		}
		try {
			f3();
		} catch (NullPointerException e) {
			System.err.println("Caught NullPointerException");
			e.printStackTrace();
		}
	}

}

