package java1_lection4;

import java1_lection1.Student;

class MathBook {

	void explain(int i) {
		System.out
				.println("The integers (from the Latin integer, literally 'untouched,' hence 'whole':"
						+ " the word entire comes from the same origin, but via French[1]) "
						+ "are formed by the natural numbers (including 0) (0, 1, 2, 3, ...) together with the negatives of the non-zero"
						+ " natural numbers (-1, -2, -3, ...).");
	};

	void explain(double i) {
		System.out
				.println("Real number is a value that represents a quantity along a continuous line. The real numbers include all the rational numbers,"
						+ " such as the integer -5 and the fraction 4/3, and all the irrational numbers such as sqrt(2) "
						+ "(1.41421356... the square root of two, an irrational algebraic number) and pi (3.14159265..., a transcendental number).");
	}

}

class BigMathBook extends MathBook {

	void explain(Student s) { // перевантаження (overwriting) метода explain
		System.out
				.println("Students are members of class Mammalia, "
						+ "air-breathing vertebrate animals characterised by the possession of endothermy, hair, three middle ear bones,"
						+ " and mammary glands functional in mothers with young.");
	}

}

/**
 * Клас демонструє перевантаження методів у випадку наслідування
 * 
 * @author Владислав
 * 
 */
public class InheritanceOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BigMathBook truebook = new BigMathBook();
		truebook.explain(10);
		truebook.explain(10.2);
		truebook.explain(new Student("Богдан", 20, 63));

	}

}
