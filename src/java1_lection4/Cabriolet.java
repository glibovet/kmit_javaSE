package java1_lection4;

class Wheel {
	private String type;

	Wheel(String type) {
		this.type = type;
		System.out.println(type + " колесо виготовлено");
	}

	@Override
	public String toString() {
		return "Колесо типу " + type;
	}

}

public class Cabriolet {
	private String type = "Кабріолет",// Ініціалізація в точці визначення
			name = "Кабріолети АвтоЗАЗ",// Ініціалізація в точці визначення
			s1, s2;
	private Wheel[] wheel;
	private int wheelsNumber;
	private int dorsNumber;

	public Cabriolet() {
		System.out.print("Ми в середині конструктора кабріолета\n");
		s1 = "Мій кабріолет";// Ініціалізація в конструкторі
		wheelsNumber = 4;
		wheel = new Wheel[4];
		wheel[0] = new Wheel("п.ліве");
		wheel[1] = new Wheel("п.праве");
		wheel[2] = new Wheel("з.ліве");
		wheel[3] = new Wheel("з.праве");
	}

	// Ініціалізація екземплярів
	{
		dorsNumber = 47;
	}

	@Override
	public String toString() {
		if (s2 == null)
			s2 = "Запорожець"; // Відкладена ініціалізація
		return "Автомобіль " + type + ",що має назву " + s2
				+ " має чотири колеса " + wheel[0] + " " + wheel[1] + " "
				+ wheel[2] + " " + wheel[3];
	}

	public static void main(String[] args) {
		Cabriolet c = new Cabriolet();
		System.out.println(c);

	}

}
