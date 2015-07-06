package java1_lection6.solution;

import java1_lection6.fail.*;

// частково реалізований клас клаберів
public abstract class BoyFromClub implements Clubber {

	private String name;

	BoyFromClub(String name) {
		this.name = name;
	}

	@Override
	public String знайомитись(Дівчина d) {
		return rockTheClub()
				+ "\n"
				+ "Я познайомився з дівчиною, ось що вона мені про себе розповіла: ";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	abstract public String rockTheClub();

}
