package java1_lection4;

class Plate {
	Plate(int i) {
		System.out.println("Конструктор тарілки");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		System.out.println("Конструктор обідньої тарілки");
	}
}

class Utensil {
	Utensil(int i) {
		System.out.println("Конструктор посуду");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println("Конструктор ложки");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println("Конструктор виделки");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		System.out.println("Конструктор ножа");
	}
}

// Щось ...
class Custom {
	Custom(int i) {
		System.out.println("Конструктор чогось :)");
	}
}

public class PlaceSetting extends Custom {
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	public PlaceSetting(int i) {
		super(i + 1);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting constructor");
	}

	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}
}
