package java1_lection2;

//Це перший раз коли ви бачите, що в обному файлі визначається два класи
//Але лише один з них може бути public
//цей клас доступний в межах пакету

class PrimitiveStudent { // Чому Primitive? Тому що студент цього класу нічого
							// не знає і не може, має тільки конструктор і метод
							// виводу.
	PrimitiveStudent() { // Це простенький конструктор
		System.out.print("Ми створили СТУДЕНТА!!! ");
	}

	@Override
	public String toString() {
		return "Я студент, але не знаю свого імені";
	}
}

/**
 * Цей клас демонструє роботу конструктора без параметрів
 * 
 * @author Владислав
 * 
 */
public class SimpleConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i)
			System.out.println(new PrimitiveStudent()); // Створюємо об'єкт
														// класу
														// PrimitiveStudent і
														// виводимо його на
														// екран
		// ми не створили посилань на створенні об'єкти, тому з часом їх прибере
		// прибиральник сміття
	}

}
