public class Student {

	private int id;
	private int age;
	private String name;

	public Student(int idInp, String nameInp, int ageInp) {
		setId(idInp);
		setName(nameInp);
		setAge(ageInp);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int x) {
		id = x;
	}

	public void setName(String y) {
		name = y;
	}

	public void setAge(int z) {
		age = z;
	}

}

