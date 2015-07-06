package java1_lection4;

class Furniture {
	Furniture() {
		System.out.println("Конструктор мебелі");
	}
}

class KitchenFurniture extends Furniture {
	KitchenFurniture() {
		System.out.println("Конструктор мебелі для кухні");
	}
}

public class Table extends KitchenFurniture {

	Table() {
		System.out.println("Конструктор стола");
	}

	public static void main(String[] args) {
		Table t = new Table();

	}

}
