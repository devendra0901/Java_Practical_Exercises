public class Outer {

	public class Inner {
		private int x;

		public Inner(int a) {
			setX(a);
		}
		public void setX(int a) {
			x = a;
		}

		public int getX() {
			return x;
		}
	}

	public Inner func(int a) {
		Inner obj = new Inner(a);
		return obj;
	}
}

