package java1_lection3;

class Lection {

	private Lection() {
	}

	public static Lection provideLesson() {
		return new Lection();
	}
}

class Practice {

	private Practice() {
	}

	private static Practice pr1 = new Practice();

	public static Practice practiceTask() {
		return pr1;
	}

	public void f() {

	}
}

public class Lesson {
	void testPrivate() {
		// Заборонено
		// Lection lect = new Lection();
	}

	void testStatic() {
		Lection lect = Lection.provideLesson();
	}

	void testSingleton() {
		Practice.practiceTask().f();
	}
}
