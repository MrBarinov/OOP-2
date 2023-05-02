

public class Student {
	private String firstname;
	private String lastname;
	private int groupNumber;
	private double avgMark;

	@Override
	public String toString() {
		return String.format("Firstname: %s Lastname: %s Group: %d AvgMark: %g", this.firstname, this.lastname,
				this.groupNumber, this.avgMark);
	}

	public Student(String firstname, String lastname, int groupNumber, double avgMark) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.groupNumber = groupNumber;
		this.avgMark = avgMark;
	}

	public String getName() {
		return this.firstname;
	}

	public String getLastName() {
		return this.lastname;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	public double getAvgMark() {
		return this.avgMark;
	}
}
