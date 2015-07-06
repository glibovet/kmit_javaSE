package java1_lection6.cars3;

public class Forza extends Car {

	public Forza(String name) {
		super(name);
	}

	@Override
	public void setTank(int i) {
		tank += i;
		if (tank < 0)
			tank = 0;
	}

	@Override
	public void fillBack(Petrol petrol, int i) {
		System.out.println("Заправляємо автомобіль Forza бензином марки - "
				+ petrol);
		setTank(i);
	}
}
