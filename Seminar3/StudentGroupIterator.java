
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
	private int counter;
	private List<Student> students;

	public StudentGroupIterator(List<Student> students) {
		this.counter = 0;
		this.students = students;
	}

	@Override
	public boolean hasNext() {
		return this.counter < this.students.size();
	}

	@Override
	public Student next() {
		if (!hasNext()) {
			return null;
		}
		return this.students.get(counter++);
	}

	public void remove() {
		this.students.remove(0);
		this.counter--;
	}

}
