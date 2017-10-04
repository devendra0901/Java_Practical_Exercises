package myFirstProject;

public class Pe1 {
	public static void main(String[] args) {
		Second secondObject = new Second();
		First firstObject = secondObject.func();
		System.out.println(firstObject.getN());
		firstObject.printMessage();
	}
}

