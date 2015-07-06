package java1_lection2;

class Teacher2 {
	Teacher2(String name) {
	}

	Teacher2(double level) {
	}
}

public class NoDefaultConstructor {
	public static void main(String[] args) {
		// Teacher2 b = new Teacher2(); // Ми не можемо написати в такий спосіб,
		// в нас немає конструктора за замовчанням
		Teacher2 b2 = new Teacher2("Петренко");
		Teacher2 b3 = new Teacher2(1.0);
	}
} // /:~
