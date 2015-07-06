package java1_lection1;

/**
 * Клас, який має можливість створити студента за допомогою конструктора з
 * параметрами. Також цей клас може виводити інформацію про себе.
 */

// Можливо не все одразу буде зрозуміло в цьому классі. Адже це тільки третя
// лекція.
// Цей клас супроводжуватиме нас і в інших прикладах, в яких вже все буде
// зрозуміло.
public class Student {

	public Student(String name, int age, double averageGrade) { // конструктор,
																// який приймає
																// ім'я, вік, та
																// середній бал
																// студента
		this.name = name;
		this.age = age;
		this.averageGrade = averageGrade;
	}

	private String name;
	private int age;
	private double averageGrade;

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getAverageGrade() {
		return this.averageGrade;
	}

	public Student changeGrade(double newgrade) {
		averageGrade = newgrade;
		return this;
	}

	public Student becomeOlder() {
		++age;
		return this;
	}

	/**
	 * перевизначаючи цей метод ви організуєте стрчікове подання свого об'єкту
	 * Ви перевизначаєте метод, так як він за замовчанням існує в будь-якого
	 * об'єкта спробуйте перевірити
	 */
	@Override
	public String toString() {
		return "Name - " + name + ", Age - " + age + ", Average Grade - "
				+ averageGrade;
	}
}