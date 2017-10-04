package myFirstProject;

public class Second {
	public First func() {
		First firstObject = new First(10) {
			@Override
			public void printMessage() {
				System.out.println("Anonymous Class created ... ");
			}
		};
		return firstObject;
	}
}

