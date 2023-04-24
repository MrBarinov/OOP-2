
import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private String firstname;
	private String lastname;
	private String surname;
	private List<StudentGroup> groups = new ArrayList<>();

	public int getGroupsCount() {
		try {
			return groups.size();
		} catch (NullPointerException e) {
			return 0;
		}
	}

	public Teacher(String firstname, String lastname, String surname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.surname = surname;
	}

	public void addGroup(StudentGroup group) {
		this.groups.add(group);
	}

	@Override
	public String toString() {
		return String.format("Lastname: %s Firstname: %s Surname: %s GroupsCount: %d", this.lastname, this.firstname,
				this.surname, getGroupsCount());
	}
}
