package java1_lection9;

public class DotNew {
	// просто порожній внутрішній клас
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}
}
