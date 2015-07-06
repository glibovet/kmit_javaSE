/**
 * Клас демонструє використання математичного округлення при приведенні типів
 */
package java1_lection2;

public class RoundNumbers {

	public static void main(String[] args) {
		double above = 0.7, belov = 0.4;
		float fabove = 0.7f, fbelov = 0.4f;

		System.out.println("(int)above: " + (int) Math.round(above));
		System.out.println("(int)belov: " + (int) Math.round(belov));
		System.out.println("(int)fabove: " + Math.round(fabove));
		System.out.println("(int)fbelov: " + Math.round(fbelov));

	}

}
