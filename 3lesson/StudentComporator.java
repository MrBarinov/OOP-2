
import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getAvgMark() < o2.getAvgMark()) {
			return -1;
		} else if (o1.getAvgMark() > o2.getAvgMark()) {
			return 1;
		} else {
			if ((o1.getName().equals(o2.getName())) && (o1.getLastName().equals(o2.getLastName()))) {
				return 0;
			} else if (o1.getLastName().length() < o2.getLastName().length()) {
				return -1;
			} else if ((o1.getLastName().length() == o2.getLastName().length())
					&& (o1.getName().length() < o2.getName().length())) {
				return -1;
			}
			return 1;
		}
	}

}
