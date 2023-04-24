
import java.util.Iterator;
import java.util.List;

public class TeachersGroupIterator implements Iterator {
	private int counter;
	private List<Teacher> teachers;

	public TeachersGroupIterator(List<Teacher> teachers) {
		this.counter = 0;
		this.teachers = teachers;
	}

	@Override
	public boolean hasNext() {
		return this.counter < this.teachers.size();
	}

	@Override
	public Teacher next() {
		if (!hasNext()) {
			return null;
		}
		return this.teachers.get(counter++);
	}

	public void remove() {
		this.teachers.remove(0);
		this.counter--;
	}

}
