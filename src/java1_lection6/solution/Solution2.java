package java1_lection6.solution;

import java1_lection6.fail.*;

class TrueClubber extends BoyFromClub {

	TrueClubber(String name) {
		super(name);
	}

	@Override
	public String знайомитись(Дівчина d) {
		return super.знайомитись(d) + d.сказатиName();
	}

	@Override
	public String rockTheClub() {
		return "I am sexy and i know it!";
	}

}

class BadClubber extends BoyFromClub {

	BadClubber(String name) {
		super(name);
	}

	@Override
	public String знайомитись(Дівчина d) {
		return super.знайомитись(d) + d.повикаблучуватися();
	}

	@Override
	public String rockTheClub() {
		return "Владимирский централ! Ветер северный...";
	}

}

/**
 * Застосування методу clubbing, для true- і badклаберів, які імплементують
 * інтерфейс клабера
 * 
 * @author Владислав
 * 
 */

public class Solution2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ГарнаДівчина гарна = new ГарнаДівчина("Алінка", "0631234567");
		НегарнаДівчина негарна = new НегарнаДівчина("Не буду називати ім'я:)",
				"0500987654");

		TrueClubber truE = new TrueClubber("Guru");
		BadClubber bad = new BadClubber("Noob");

		Club.clubbing(bad, негарна);
		System.out.println();
		System.out.println();

		Club.clubbing(truE, гарна);
	}

}
