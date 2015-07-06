package java1_lection5.cars2;

public class HondaCRV extends Car {

	private int tank = 0;
	private String name = "";

	@Override
	public String name() {
		return name;
	}

	@Override
	public int getTank() {
		return tank;
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
