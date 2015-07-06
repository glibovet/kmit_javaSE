package java1_lection6.cars3;

public class HondaCRV extends Car {

	public HondaCRV(String name) {
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
		System.out.println("Заправляємо автомобіль Honda бензином марки - "
				+ petrol);
		setTank(i);
	}

}
