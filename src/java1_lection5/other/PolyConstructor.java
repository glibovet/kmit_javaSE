package java1_lection5.other;

class Glyph {
	// private void draw() { System.out.println("Glyph.draw()"); }
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	@Override
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructor {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
