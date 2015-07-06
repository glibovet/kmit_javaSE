package java1_lection4;

final class LadaPriora {

	public final String quality = "fail"; // незмінна константа
	private int run;

	public LadaPriora(int run) {
		this.run = run;
	}

	public LadaPriora runYear() {
		++run;
		return this;
	}

	@Override
	public String toString() {
		return "Я Лада Пріора і мій пробіг = " + run;
	}
}

// class UpratedLada extends LadaPriora{
// }
// error: Не можна створювати нічого на основі Лади Пріори :)
// А насправді просто не можна наслідуватись від final-класів.

/**
 * Клас демонструє особливості індефікатору доступу final
 * 
 * @author Владислав
 * 
 */

public class AutoMarket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LadaPriora l = new LadaPriora(10);
		// l.quality="good";
		// error: Якість лади Пріора не може бути покращена :)
		// А насправді просто не можна змінювати фінальні значення.
		l.runYear().runYear().runYear();
		System.out.println(l);
	}

}
