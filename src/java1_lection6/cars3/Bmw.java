package java1_lection6.cars3;

public class Bmw extends Car {

	public Bmw(String name) {
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
		System.out.println("Заправляємо автомобільBmw бензином марки - "
				+ petrol);
		setTank(i);
	}
}
