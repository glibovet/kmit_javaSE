package java1_lection6.fail;

/**
 * Трошки примітивний клас для прикладу
 * 
 * @author Владислав
 * 
 */
// Різновид дівчат
public class ГарнаДівчина extends Дівчина {

	public ГарнаДівчина(String name, String number) {
		super(name, number);
	}

	@Override
	public String повикаблучуватися() {
		return "Я люблю читати книжки, готувати смачну їжу і грати на музичних інструментах";
	}

}
