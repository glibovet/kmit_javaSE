package java1_lection2;

public class UniversityStudent {

	int studentCourse = 0;
	String name = "";

	// студент без імені (анонім :) ) зарахований на курс
	UniversityStudent(int course) {
		studentCourse = course;
		System.out
				.println("Студент без імені (анонім :) ) зарахований на курс = "
						+ studentCourse);
	}

	// Зараховуємо студента в університет знаючи лише ім'я
	UniversityStudent(String ss) {
		name = ss;
		System.out.println("Студент " + name + " зарахований в університет");

	}

	// Зараховуємо студента з ім'ям name на вказаний курс
	UniversityStudent(String name, int course) {
		this(course);
		// ! this(name); // Так не можна робити
		this.name = name; // Інше використання"this"
		System.out.println("Студент " + name + " зарахований в університет на "
				+ course + " курс");
	}

	// Конструктор по замовчанню
	UniversityStudent() {
		this("Петров", 1);
		System.out.println("Створюємо типового студента");
	}

	void printStudentCourse() {
		// ! this(11); // Not inside non-constructor!
		System.out.println("Студент = " + name + " навчається на "
				+ studentCourse + " курсі");
	}

	public static void main(String[] args) {
		UniversityStudent x = new UniversityStudent();
		x.printStudentCourse();
	}
}
