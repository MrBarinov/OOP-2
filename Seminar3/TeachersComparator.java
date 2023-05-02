
import java.util.Comparator;

public class TeachersComparator implements Comparator<Teacher> {

	@Override
	public int compare(Teacher o1, Teacher o2) {
		if (o1.getGroupsCount() < o2.getGroupsCount()) {
			return -1;
		} else if (o1.getGroupsCount() > o2.getGroupsCount()) {
			return 1;
		}
		return 0;
	}

}
