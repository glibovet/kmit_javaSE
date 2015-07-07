package java1_lection6.fail;

/**
 * Трошки примітивний клас для прикладу
 * 
 * @author Владислав
 * 
 */
// Різновид дівчат
public class НегарнаДівчина extends Дівчина {

	public НегарнаДівчина(String name, String number) {
		super(name, number);
	}

	@Override
	public String датиНомер() {
		return "Мій номер всі хотять знати - не скажу";
	}

	@Override
	public String повикаблучуватися() {
		return "Я не така як усі, і взагалі ти кращу за мене ніколи не знайдеш!!!";
	}

}
