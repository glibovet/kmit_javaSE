package java1_lection6.fail;

class Clubber {

	private String name;

	public Clubber(String name) {
		this.name = name;
	}

	public String rockTheClub() {
		return "качаю!";
	}

	public String знайомитись(Дівчина d) {
		return "Я познайомився з дівчиною!;";
	}

	public String getName() {
		return name;
	}
}

// Різновид клаберів
class TrueClubber extends Clubber {

	public TrueClubber(String name) {
		super(name);
	}

	@Override
	public String rockTheClub() {
		return "I am sexy and i know it!";
	}

	@Override
	public String знайомитись(Дівчина д) {
		rockTheClub();
		return rockTheClub()
				+ "\n"
				+ "Я познайомився з дівчиною, ось що вона мені про себе розповіла: "
				+ д.сказатиName();
	}
}

// Інший різновид клаберів
class BadClubber extends Clubber {

	public BadClubber(String name) {
		super(name);
	}

	@Override
	public String rockTheClub() {
		return "Владимирский централ! Ветер северный...";
	}

	@Override
	public String знайомитись(Дівчина д) {

		return rockTheClub()
				+ "\n"
				+ "Я познайомився з дівчиною, ось що вона мені про себе розповіла: "
				+ д.повикаблучуватися();
	}

}

/**
 * Клас демонструє необхідність відділення інтерфейсу від реалізації
 * 
 * @author Владислав
 * 
 */
public class BadIdea {

	public static void clubbing(Clubber c, Дівчина d) {
		System.out.println(c.getName());
		System.out.println(c.знайомитись(d));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TrueClubber tru = new TrueClubber("Антон");
		BadClubber fail = new BadClubber("Інокентій");

		clubbing(tru, new ГарнаДівчина("Марічка", "0631234567"));
		System.out.println();
		System.out.println();
		clubbing(fail, new НегарнаДівчина("Марічка", "102"));

		// На перший погляд все гарно працює.
		// Але тепер давайте глянемно на клас SmartBoy і його нащадків
		// TrueProgramer і Economist
		// Як бачите, хоч вони не вміють rockTheClub, але вони теж хлопці і
		// вміють знайомитись з дівчатами.
		// Але нажаль ми не можемо їх наслідувати
		// від клаберів, і тому ми не можемо запобігти дубляжу коду, якщо хочемо
		// застосувати до них метод clubing;

		// clubing(new Economist("Vasya"),new НегарнаДівчина("Марічка","102"));
	}

}
