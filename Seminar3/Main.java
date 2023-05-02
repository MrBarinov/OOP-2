import java.util.ArrayList;
import java.util.List;

public class Main {
	private static final double AVG = 4.5;

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student("Иван", "Иванов", 1, 3.7));
		students.add(new Student("Петр", "Петров", 2, 4.8));
		students.add(new Student("Сидр", "Сидоров", 3, 4));
		students.add(new Student("Карась", "Карасев", 1, 4));
		students.add(new Student("Спиридон", "Спиридонов", 3, 3.6));
		students.add(new Student("Ян", "Янский", 2, 4.7));
		StudentGroupIterator iter = new StudentGroupIterator(students);
		students.sort(new StudentComporator());
		Student current;
		while (iter.hasNext()) {
			current = iter.next();
			if (current.getAvgMark() >= AVG) {
				System.out.println(current);
			}
		}

		List<Teacher> teachers = new ArrayList<>();
		Teacher teacherFirst = new Teacher("Галина", "Васильева", "Александровна");
		Teacher teacherSecond = new Teacher("Иван", "Кондратюк", "Фёдорович");
		Teacher teacherThird = new Teacher("Сергей", "Семашко", "Феликсович");
		StudentGroup group1 = new StudentGroup();
		StudentGroup group2 = new StudentGroup();
		StudentGroup group3 = new StudentGroup();
		group1.setGroup(1);
		group2.setGroup(2);
		group3.setGroup(3);
		group1.addTeacher(teacherFirst);
		group2.addTeacher(teacherThird);
		group3.addTeacher(teacherFirst);
		teacherFirst.addGroup(group1);
		teacherFirst.addGroup(group3);
		teacherThird.addGroup(group2);
		teachers.add(teacherFirst);
		teachers.add(teacherSecond);
		teachers.add(teacherThird);
		TeachersGroupIterator iterT = new TeachersGroupIterator(teachers);
		teachers.sort(new TeachersComparator());
		while (iterT.hasNext()) {
			System.out.println(iterT.next());
		}
	}
}
