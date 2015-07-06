/**
 * Даний клас демонструє можливості приведення типів
 * @author Andrii
 *
 */
package java1_lection2;

public class Casting {

	public static void main(String[] args) {
		int i = 10;
		long lng = i;
		lng = i; // "Розширення", явне перетворення не обов'язкове

		long lng2 = 200;

		lng2 = 200;// в даному випадку явне перетворення теж не обов'язково
					// робити

		i = (int) lng2; // "Звужуюче" перетворення, перетворення необхідно
						// робити обов'язково явно
		// i=lng2;
	}

}
