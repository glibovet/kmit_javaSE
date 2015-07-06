package java1_lection4;

import java.util.Random;
import java1_lection1.Student;

/**
 * Клас демонструє переваги використання наслідування
 * 
 * @author Владислав
 * 
 */
public class Adult extends Student {

	private double salary;

	public Adult(String name, int age, double averageGrade, double salary) {
		super(name, age, averageGrade);
		this.salary = salary;
	}

	public static Student studyInUniversity(Student victim) {
		Random rand = new Random(13);
		victim.becomeOlder().becomeOlder().becomeOlder().becomeOlder()
				.changeGrade(victim.getAverageGrade() + rand.nextInt(30) - 15);
		return victim;
	}

	public double getSalary() {
		return salary;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Adult people[] = new Adult[4]; // створення масиву

		// ініціалізація
		people[0] = new Adult("Петро", 18, 75, 3);
		people[1] = new Adult("Олена", 19, 65, 6);
		people[2] = new Adult("Аліна", 18, 61, 99);
		people[3] = new Adult("Владислав", 17, 85, 3);
		System.out.println("Люди до університету.");
		for (Adult a : people)
			System.out.println(a);
		System.out.println();
		System.out.println("Пішли вчитись...");
		for (Adult a : people)
			studyInUniversity(a); // висхідне перетворення Adult до Student. В
									// випадку композиції таке неможливо.
		System.out.println();
		System.out.println("Люди після університету");
		for (Adult a : people)
			System.out.println(a);
	}

}
