package java1_lection6.fail;

//Різновид розумних хлопців
public class Economist extends SmartBoy {

	public Economist(String name) {
		super(name);
		this.setIQ(50);
	}

	@Override
	public String знайомитись(Дівчина d) {
		return "Я познайомився з дівчиною, ось що вона мені про себе розповіла: "
				+ d.сказатиName()
				+ "\n"
				+ "because my iq is "
				+ super.getIQ()
				+ " :(";
	}

	@Override
	public String getName() {
		return "Economist: " + super.getName();
	}

}
