/** 
 * Цей клас демонструє переваги методів, які повертають вказівник на об'єкт поточного класу. Тобто повертають самі себе(this)
 * @author Владислав
 *
 */
package java1_lection2;

import java1_lection1.Student;

public class Leaf {

	public static void main(String[] args) {

		Student s = new Student("Andrii", 20, 81);
		System.out.println(s);
		s.changeGrade(91).becomeOlder().becomeOlder();
		System.out.println(s);
	}

}
