package java1_lection6.solution;

import java1_lection6.fail.*;

/**
 * Вирішення проблеми з застосуванням методу clubbing до розумних хлопців
 * 
 * @author Владислав
 * 
 */

public class Solution1 {

	public static void main(String[] args) {

		ГарнаДівчина гарна = new ГарнаДівчина("Настя", "0631234567");
		НегарнаДівчина негарна = new НегарнаДівчина("Не буду називати ім'я:)",
				"0500987654");
		Economist e = new Economist("Vasya");
		TrueProgramer truE = new TrueProgramer("Vlad");

		Club.clubbing(new ClubberAdapter(e), негарна);
		System.out.println();
		System.out.println();

		Club.clubbing(new ClubberAdapter(truE), гарна);
	}

}
