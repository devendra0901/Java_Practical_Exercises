public class Member {

	private int age;
	private double salary;
	private String name;

	public Member(String initName, int initAge, double initSalary) {
		age = initAge;
		salary = initSalary;
		name = initName;

	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}

