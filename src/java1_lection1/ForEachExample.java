package java1_lection1;

import java.util.Random;

/**
 * Цей клас демонструє можливості циклу foreach
 * 
 * @author Владислав Вальт
 * 
 */

public class ForEachExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random(47);
		int randvalue = rand.nextInt(10);
		Student dreamgroup[] = new Student[randvalue];														
		for (int i = 0; i < randvalue; i++)
			dreamgroup[i] = new Student("Number" + i, rand.nextInt(10) + 18,
					rand.nextInt(50) + 50);

		System.out.println("��������: ");
		for (int i = 0; i < randvalue; i++)
			System.out.println(dreamgroup[i]);

		System.out.println();
		System.out.println();

		System.out.println("�������� �����: ");
		for (Student s : dreamgroup)
			System.out.println(s); 
	}

}
