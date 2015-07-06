package java1_lection4;

class WithFinals {
	// Ідентичне такому ж запису без слова final
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	// Final автоматично
	private void g() {
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	// думаємо, що робимо перекриття
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}

	// думаємо, що робимо перекриття
	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	// думаємо, що робимо перекриття
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}

	// думаємо, що робимо перекриття
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// Тепер зробимо висхідне пертворення
		OverridingPrivate op = op2;
		// Але ви не можете викликати методи ...
		// ! op.f();
		// ! op.g();
		// Теж саме і тут
		WithFinals wf = op2;
		// ! wf.f();
		// ! wf.g();
	}
}
