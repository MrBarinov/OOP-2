import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeachersGroup implements Iterable {
	List<Teacher> teachers = new ArrayList<>();

	@Override
	public Iterator iterator() {
		return new TeachersGroupIterator(teachers);
	}

}
