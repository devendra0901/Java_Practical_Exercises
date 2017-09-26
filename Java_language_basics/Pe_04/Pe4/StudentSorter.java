import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

	public int compare(Student a, Student b) {
		if (a.getAge() != b.getAge()) {
			return b.getAge() - a.getAge();
		} else if (!(a.getName().equals(b.getName()))) {
			return a.getName().compareTo(b.getName());
		} else {
			return a.getId() - b.getId();
		}
	}

}

