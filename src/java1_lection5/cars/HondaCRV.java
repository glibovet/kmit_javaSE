package java1_lection5.cars;

public class HondaCRV extends Car {

	@Override
	public void fillBack(Petrol petrol, int i) {
		if (petrol == Petrol.P92)
			System.out
					.println("Ми не можемо заправити наш автомобіль цим паливом");
		else {
			System.out.println("Заправляємо автомобіль Honda бензином марки - "
					+ petrol);
			setTank(i);
			System.out.println("Заправили - " + i + " літрів");
		}
	}

}
