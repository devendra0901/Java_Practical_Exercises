public class Sequence {

	private int size;

	public Sequence(int size) {
		this.size = size;
	}

	public class ReverseSequenceSelector implements selector {

		@Override
		public int next() {
			return size - 1;
		}

		@Override
		public int end() {
			return 0;
		}

		@Override
		public int current() {
			return size;
		}

		public void rev() {
			while (current() != end()) {
				System.out.print(next() + " ");
				size--;
			}
		}
	}

}

