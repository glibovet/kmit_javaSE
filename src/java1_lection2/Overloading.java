/**
 * Цей клас демонструє перевантаження методів
 */

package java1_lection2;

class Student3 {
	int course;
	String name;

	// Конструктор за замовчанням
	Student3() {
		System.out.println("Прийняли студента на перший курс");
		course = 0;
	}

	// конструктор який дозволяє прийняти студента на заданий курс
	Student3(int initialC) {
		course = initialC;
		System.out.println("Прийняли студента на " + course + " курс");
	}

	Student3(int initialC, String name) {
		course = initialC;
		this.name = name;
		System.out.println("Прийняли студента " + name + " на " + course
				+ " курс");
	}

	// метод що повертає курс на якому вчиться студент
	void info() {
		if (name != null) {
			System.out.println("Студент " + name + " навчається на " + course
					+ " курсі");
		} else
			System.out.println("Студент навчається на " + course + " курсі");
	}

	// перевизначимо метод
	void info(String s) {
		System.out.println(s + ": Студент навчається на " + course + " курсі");
	}
}

public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Student3 s;
			if (i != 3) {
				s = new Student3(i);
			} else {
				s = new Student3(i, "Петров");
			}
			s.info();
			s.info("перевизначений метод");
		}

		new Student3();
	}
}