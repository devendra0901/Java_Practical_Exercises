public class Outer {

	public static void main(String[] args) {
		Hand hand = func();
		hand.facepalm();
	}

	public static Hand func() {
		class Palm implements Hand {

			@Override
			public void facepalm() {
				System.out.println("Printing facepalm ...");
			}

		}
		Hand hand = new Palm();
		return hand;
	}
}

