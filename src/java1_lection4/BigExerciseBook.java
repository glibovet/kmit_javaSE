package java1_lection4;

class ExerciseBook {

	private String name;
	private int numberOfSheets;
	private String color;

	public ExerciseBook(String name) {
		this.name = name;
		numberOfSheets = 24;
		color = "grey";
	}

	protected ExerciseBook setNumberOfSheets(int newNumber) { // захищений метод
		numberOfSheets = newNumber;
		return this;
	}

	protected ExerciseBook setColor(String newColor) { // захищений метод
		color = newColor;
		return this;
	}

	@Override
	public String toString() {
		return "name = " + name + "\n" + "numberOfSheets = " + numberOfSheets
				+ "\n" + "color = " + color;
	}
}

/**
 * класс демонструє доступ до полів з індефікатором доступу protected
 * 
 * @author Владислав
 * 
 */
public class BigExerciseBook extends ExerciseBook {

	public BigExerciseBook(String name, int numberOfSheets, String color) { // конструктор,
																			// який
																			// змінює
																			// базовий
																			// клас
																			// через
																			// його
																			// захищені
																			// методи
		super(name);
		this.setNumberOfSheets(numberOfSheets).setColor(color); // як я можу
																// змінювати
																// private-значення
																// базового
																// класу? -
																// Методи
																// protected.
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BigExerciseBook e = new BigExerciseBook("Матаналіз", 96, "Black");
		System.out.println(e);
	}

}
