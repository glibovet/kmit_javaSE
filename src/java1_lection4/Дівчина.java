package java1_lection4;

/**
 * Клас демонструє переваги делегування перед нелогічним наслідуванням
 * 
 * @author Владислав
 * 
 */
public class Дівчина {

	private Волосся волосся;

	private String name;
	private boolean brain = true;

	public Дівчина(String name) {
		this.name = name;
		волосся = new Волосся();
	}

	public void зачісати() {
		волосся.зачісати();
	}

	public void пофарбувати() {
		волосся.пофарбувати();
	}

	public void підстригти() {
		волосся.підстригти();
	}

	public void помити() {
		волосся.помити();
	}

	@Override
	public String toString() {
		return name + ". До речі, в мене " + волосся;
	}

	public static void main(String[] args) {

		Дівчина дівчина = new Дівчина("Діана");

		// Все круто - дівчинка справляється зі своїм волосям
		дівчина.підстригти();
		дівчина.помити();
		дівчина.зачісати();
		дівчина.пофарбувати();

		System.out
				.println(" - Привіт дівчино, в вас такі чарівні очі...давайте познайомимось");
		System.out.println(" - Привіт незнайомцю. Спробуй.");
		System.out
				.println(" - Я осьо знаєш студент з могилянки, на програміста вчуся.");
		System.out.println(" - Круто! Що ж можна і познайомитись - ти правий.");
		System.out.println(" - Мене звати Владислав. А яке твоє ім'я? ");
		System.out.println(" - Я " + дівчина); // І жодних проблем немає. І не
												// може бути. Адже використано
												// правильний підхід у
												// проектуванні класу.
		System.out.println(" - Що ти робиш сьогодні після роботи?");
		System.out.println(" ...");
		System.out.println(" ...to be continued");

		// love story:)
	}

}
