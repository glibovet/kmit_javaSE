package java1_lection6.cars3;

public class CarTester {
	public static void drive(Car car) {
		// робимо перевірку чи не порожній бак і якщо так заправляємо
		if (car.getTank() == 0)
			car.fillBack(Petrol.P95, 10);
		// їдемо
	}

	public static void driveAll(Car[] cars) {
		for (Car car : cars)
			drive(car);
	}

	public static void main(String[] args) {
		Car[] garage = { new HondaCRV("Хонда"), new Forza("Запорожець"),
				new Bmw("Бумер"), new BmwX5("Бумер X5") };
		driveAll(garage);
	}
}
