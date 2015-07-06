package java1_lection6.fail;

//Різновид розумних хлопців
public class TrueProgramer extends SmartBoy {

	public TrueProgramer(String name) {
		super(name);
		this.setIQ(150);
	}

	@Override
	public String знайомитись(Дівчина d) {
		return "Я познайомився з дівчиною, ось що вона мені про себе розповіла: "
				+ d.сказатиName()
				+ " - "
				+ d.датиНомер()
				+ "\n"
				+ "because my iq is " + super.getIQ() + " :)";
	}

	@Override
	public String getName() {
		return "TrueProgrammr: " + super.getName();
	}

}
