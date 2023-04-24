
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable {
	private List<Student> students = new ArrayList<>();
	private Teacher teacher;
	private int groupNumber;

	@Override
	public Iterator iterator() {
		return new StudentGroupIterator(this.students);
	}

	public void addTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setGroup(int groupNumber) {
		this.groupNumber = groupNumber;
	}
}
