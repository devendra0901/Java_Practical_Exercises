public class main {

	public static void main(String[] args) {

		Outer obj = new Outer();
		obj.func(5); // Initializes a private field of Inner Class
		System.out.println(obj.func(5).getX());
	}

}

