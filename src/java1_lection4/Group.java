package java1_lection4;

import java1_lection1.Student;

/**
 * Клас демонструє особливості конструкторів класів з final-полями
 * 
 * @author Владислав
 * 
 */
public class Group {

	private final int createYear; // порожня константа
	private final int yearOfEscape; // порожня константа
	private final Student group[]; // порожнє посилання П.С: масив то постійний,
									// але студентів всередині можна змінювати
									// :)

	// public Group(){}; // помилка. не проініціалізовані фінальні поля.

	// всі final-поля мають бути проініціалізовані в конструкторі
	public Group(int createYear, int yearOfEscape, Student group[]) {
		this.createYear = createYear;
		this.yearOfEscape = yearOfEscape;
		this.group = group.clone(); // Що так clone? - це копія об'єкту. Для
									// чого? - Щоб посилання group вказувало не
									// на отриманий масив, а на свій.
	}

	public void say() { // Звичайно toString кращий варіант. Але цей метод
						// швидше пишеться :)
		for (Student s : group)
			System.out.println(s);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student grouplist[] = new Student[4];
		grouplist[0] = new Student("Петро", 19, 87.3);
		grouplist[1] = new Student("Анастасія", 19, 91.5);
		grouplist[2] = new Student("Данило", 19, 96.34);
		grouplist[3] = new Student("Ілля", 19, 95.9);

		Group group = new Group(2010, 2014, grouplist);
		group.say();
	}

}
