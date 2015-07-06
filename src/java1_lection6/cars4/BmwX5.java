package java1_lection6.cars4;

public class BmwX5 extends Bmw {

	@Override
	public void fillBack(Petrol petrol, int i) {
		System.out.println("Заправляємо автомобіль BmwX5 бензином марки - "
				+ petrol);
		setTank(i);
	}

}
