package java1_lection5.cars;

public class CarTester {

	public static void drive(Car car) {
		// робимо перевірку чи не порожній бак і якщо так заправляємо
		if (car.getTank() == 0)
			car.fillBack(Petrol.P95, 10);
		// їдемо
	}

	public static void main(String[] args) {
		HondaCRV myCar = new HondaCRV();
		drive(myCar);
	}
}
