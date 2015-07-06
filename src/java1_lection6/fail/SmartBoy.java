package java1_lection6.fail;

public class SmartBoy {

	private String name;
	private int IQ;

	public SmartBoy(String name) {
		this.name = name;
		IQ = 100;
	}

	public SmartBoy becomeSmarter() {
		++IQ;
		return this;
	}

	public String знайомитись(Дівчина d) {
		return "Я познайомився з дівчиною!;";
	}

	protected SmartBoy setIQ(int iq) {
		this.IQ = iq;
		return this;
	}

	public int getIQ() {
		return IQ;
	}

	public String getName() {
		return name;
	}

}
