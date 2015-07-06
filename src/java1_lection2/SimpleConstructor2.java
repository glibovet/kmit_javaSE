/**
 * Клас демонструє роботу конструктора з параметрами
 * @author Владислав
 *
 */

package java1_lection2;

import java1_lection1.Student;

public class SimpleConstructor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 5; ++i)
			// new Student() - тепер неправильна конструкція, адже не визначений
			// конструктор без параметрів
			System.out.println(new Student(String.valueOf(i), 18 + i, 71 + i)); // Створюємо
																				// об'єкт
																				// класу
																				// Student
																				// і
																				// виводимо
																				// його
																				// на
																				// екран
		// тепер параметри,які конструктор отримав враховуються при виводі
		// інформації про Студента
		// ми не створили посилань на створенні об'єкти, тому з часом їх прибере
		// прибиральник сміття
	}

}
