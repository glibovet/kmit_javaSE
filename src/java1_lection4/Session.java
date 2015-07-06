package java1_lection4;

import java.util.Random;

import java1_lection1.Student;

/**
 * Клас демонструє особливості final-аргументів
 * 
 * @author Владислав
 * 
 */
public class Session {

	Random rand = new Random();

	public Student challengeStudent(Student s) {
		if (s.getAverageGrade() > 59)
			return saveChallenge(s);
		return dangerousChallenge(s);

	}

	private Student saveChallenge(final Student s) {
		s.changeGrade(s.getAverageGrade() + rand.nextInt(30));
		// s = null; не можна змінити фінальне посилання.
		return s;
	}

	private Student dangerousChallenge(Student s) {
		s.changeGrade(s.getAverageGrade() + rand.nextInt(30));
		if (s.getAverageGrade() < 61)
			s = null;
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student grouplist[] = new Student[4];
		grouplist[0] = new Student("Петро", 19, 64.5); // Петро точно складе
														// сессію
		grouplist[1] = new Student("Анастасія", 19, 70); // Анастасія також
		grouplist[2] = new Student("Василь", 19, 20.34); // Василь не має жодних
															// шансів
		grouplist[3] = new Student("Аліна", 19, 45.2); // Аліна має шанси, але
														// може й завалити

		Session trouble = new Session();
		for (Student s : grouplist)
			System.out.println(trouble.challengeStudent(s));
	}

}
