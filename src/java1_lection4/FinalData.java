package java1_lection4;

import java.util.*;

class Value {
	int i; // доступ в рамках пакету

	public Value(int i) {
		this.i = i;
	}
}

public class FinalData {
	private static Random rand = new Random(47);
	private String id;

	public FinalData(String id) {
		this.id = id;
	}

	// константи часу копміляції
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;

	// типічна публічна константа, присутня на рівні класу
	public static final int VALUE_THREE = 39;

	// Не можуть бути константами часу компіляції
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);

	private Value v1 = new Value(11);

	// вказівник v2 тепер зафіксований за одним об'єктом
	// але сам об'єкт може змінюватися
	private final Value v2 = new Value(22);

	// теж саме, але ще й на рівні класу
	private static final Value VAL_3 = new Value(33);

	// масиви
	private final int[] a = { 1, 2, 3, 4, 5, 6 };

	@Override
	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		// ! fd1.valueOne++; // Error: не можна змінити значення
		fd1.v2.i++; // Але об'єкт не константа і його можна змінювати
		fd1.v1 = new Value(9); // OK -- v1 не оголошено як final
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++; // об'экт не константа, масив це об'єкт
		// ! fd1.v2 = new Value(0); // Error: не можемо
		// ! fd1.VAL_3 = new Value(1); // не можемо
		// ! fd1.a = new int[3]; // не можемо
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
	}
}
