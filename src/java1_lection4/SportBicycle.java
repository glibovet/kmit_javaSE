package java1_lection4;

class Bicycle {

	private String name = "Велосипед";

	protected int velocity = 0;

	public void addName(String a) {
		name += " " + a;
	}

	public void rideFaster(int i) {
		velocity += i;
	}

	public void rideSlower(int i) {
		velocity -= i;
		if (velocity < 0)
			velocity = 0;
	}

	@Override
	public String toString() {
		return name + " їде з швидкістю " + velocity;
	}

	public static void main(String[] args) {
		Bicycle x = new Bicycle();
		x.addName("МІЙ");
		x.rideFaster(5);
		x.rideSlower(3);
		System.out.print(x);
	}
}

public class SportBicycle extends Bicycle {

	// додаємо нові поля
	private int transmission = 1;

	// Змінюємо метод:
	@Override
	public void rideFaster(int i) {
		super.rideFaster(i);
		if (velocity / 5 >= transmission)
			transmission = velocity / 5 + 1;
	}

	// Змінюємо метод:
	@Override
	public void rideSlower(int i) {
		super.rideSlower(i);
		if ((transmission > 1) && (velocity / 5 < transmission))
			transmission = velocity / 5 + 1;
	}

	// додамо метод
	public void stop() {
		transmission = 1;
		velocity = 0;
	}

	@Override
	public String toString() {
		return super.toString() + " передача " + transmission;
	}

	public static void main(String[] args) {
		SportBicycle b = new SportBicycle();
		b.rideFaster(5);
		System.out.println(b);
		b.rideFaster(20);
		System.out.println(b);
		b.stop();
		System.out.println(b);
		b.rideFaster(41);
		System.out.println(b);
		b.rideSlower(20);
		System.out.println(b);
		System.out.println("А тепер викличемо базовий клас");
		Bicycle.main(args);
	}

}
