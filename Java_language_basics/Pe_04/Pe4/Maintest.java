import java.util.*;

public class Maintest {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Eugene", 15);
		Student s2 = new Student(2, "Harry", 14);
		Student s3 = new Student(3, "Olive", 17);
		Student s4 = new Student(4, "Bluto", 16);
		Student s5 = new Student(5, "Alice", 12);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Collections.sort(list, new StudentSorter());

		for (Student s : list)
			System.out.println(s.getId() + ".  " + s.getName() + "   " + s.getAge());

	}

}

