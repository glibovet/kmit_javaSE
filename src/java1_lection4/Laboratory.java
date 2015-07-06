package java1_lection4;

class Room {
	private int placesNumber;

	Room(int i) {
		placesNumber = i;
		System.out.println("Конструктор кімнати");
	}

	@Override
	public String toString() {
		return "Кімната вміщає " + placesNumber + " людей.\n";
	}

}

class UniversityRoom extends Room {
	private boolean hasFurniture;

	UniversityRoom(int i, boolean furniture) {
		super(i);
		hasFurniture = furniture;
		System.out.println("Конструктор університетської кімнати");
	}

	@Override
	public String toString() {
		if (hasFurniture)
			return super.toString() + "Кімната обладнана меблями.\n";
		else
			return super.toString() + "Кімната не обладнана меблями.\n";
	}

}

public class Laboratory extends UniversityRoom {
	private int computersNumber;

	
	// Laboratory(){
	Laboratory(int i, boolean furniture, int computers) {
		super(i, furniture);
		computersNumber = computers;
		System.out.println("Конструктор лабораторії");
	}

	@Override
	public String toString() {
		return super.toString() + "В кімнаті розташовано " + computersNumber
				+ " комп'ютерів";
	}

	public static void main(String[] args) {
		Laboratory l = new Laboratory(12, true, 5);
		System.out.print(l);
	}
}
