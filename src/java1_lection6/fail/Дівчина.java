package java1_lection6.fail;

public abstract class Дівчина {
	private String name;
	private String number;

	public Дівчина(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String сказатиName() {
		return name;
	}

	public String датиНомер() {
		return number;
	}

	abstract public String повикаблучуватися();

}
