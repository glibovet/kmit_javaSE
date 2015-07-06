package java1_lection5.cars;

class Forza extends Car {

	@Override
	public void fillBack(Petrol petrol, int i) {
		System.out.println("Заправляємо автомобіль Forza бензином марки - "
				+ petrol);
		setTank(i);
		System.out.println("Заправили - " + i + " літрів");

	}

}

class BmwX5 extends Car {

	@Override
	public void fillBack(Petrol petrol, int i) {
		if (petrol != Petrol.SUPER)
			System.out.println("Ми не можемо заправити наш BMW цим паливом");
		else {
			System.out.println("Заправляємо автомобіль бензином марки - "
					+ petrol);
			setTank(i);
			System.out.println("Заправили - " + i + " літрів");
		}
	}

}

public class CarTester2 {

	public static void drive(HondaCRV honda) {
		// робимо перевірку чи не порожній бак і якщо так заправляємо
		if (honda.getTank() == 0)
			honda.fillBack(Petrol.P95, 10);
		// їдемо
	}

	public static void drive(Forza forza) {
		// робимо перевірку чи не порожній бак і якщо так заправляємо
		if (forza.getTank() == 0)
			forza.fillBack(Petrol.P92, 15);
		// їдемо
	}

	public static void drive(BmwX5 bmw) {
		// робимо перевірку чи не порожній бак і якщо так заправляємо
		if (bmw.getTank() == 0)
			bmw.fillBack(Petrol.P92, 35);
		// їдемо
	}

	public static void main(String[] args) {
		HondaCRV h = new HondaCRV();
		Forza f = new Forza();
		BmwX5 b = new BmwX5();

		drive(h);
		drive(f);
		drive(b);
	}

}
