package java1_lection6.cars3;

public abstract class Car {
	protected int tank = 0;
	protected String name = "";

	public Car(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	public int getTank() {
		return tank;
	}

	abstract void setTank(int i);

	abstract void fillBack(Petrol petrol, int i);
}
