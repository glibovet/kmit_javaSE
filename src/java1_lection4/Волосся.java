package java1_lection4;

/**
 * Допоміжний клас для демонстрації делегування
 * 
 * @author Владислав
 * 
 */
public class Волосся {

	private boolean зачісане = false;
	private boolean пофаброване = false;
	private boolean підстрижене = false;
	private boolean помите = false;

	public void зачісати() {
		зачісане = true;
	}

	public void пофарбувати() {
		пофаброване = true;
	}

	public void підстригти() {
		підстрижене = true;
	}

	public void помити() {
		помите = true;
	}

	@Override
	public String toString() {
		String s = new String();
		boolean flag = false;
		if (зачісане) {
			s += "зачісане";
			flag = true;
		}
		if (пофаброване) {
			if (flag)
				s += ",";
			s += "пофаброване";
			flag = true;
		}
		if (підстрижене) {
			if (flag)
				s += ",";
			s += "підстрижене";
			flag = true;
		}
		if (підстрижене) {
			if (flag)
				s += ",";
			s += "помите";
			flag = true;
		}
		return s + " волосся";
	}
}
