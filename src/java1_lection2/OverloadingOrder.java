/**
 * Клас демонструє вибір методу, залежно від порядку отриманих параметрів. 
 * @author Владислав
 *
 */
package java1_lection2;

import java1_lection1.Student;

public class OverloadingOrder {

	static Student createStudent(String name, int age, double averageGrade) {
		System.out.println("Метод №1 для створення студента");
		return new Student(name, age, averageGrade);
	}

	static Student createStudent(int age, double averageGrade, String name) {
		System.out.println("Метод №2 для створення студента");
		return new Student(name, age, averageGrade);
	}

	static Student createStudent(double averageGrade, int age, String name) {
		System.out.println("Метод №3 для створення студента");
		return new Student(name, age, averageGrade);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Як бачимо порядок аргументів визначає метод, який використовується
		System.out.println(createStudent("Петро", 19, 85.4));
		System.out.println(createStudent(19, 83.4, "Катя"));
		System.out.println(createStudent(75.2, 20, "Олена"));
	}

}
