package java1_lection3;

class Bread {
	private Bread() {
		System.out.println("Нова буханка хліба");
	}

	private Bread slice() {
		System.out.println("Порізали хліб");
		return this;
	}

	static Bread prepareBread() {
		return new Bread().slice();
	}
}
