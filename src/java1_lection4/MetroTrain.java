package java1_lection4;

class Engine {
	public void move() {
		System.out.println("The vehicle start moving");
	}

	public void stop() {
		System.out.println("The vehicle stops");
	}
}

class Door {
	private String name;

	public Door(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println(name + " is opening");
	}

	public void close() {
		System.out.println(name + " is cloosing");
	}
}

class Doors {

	private int numberOfDoors; // Взагалі-то це поле не зайве. Просто в методах
								// нам воно не знадобилося завдяки магічному
								// циклу foreach :)
	private Door[] doors;

	public Doors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		doors = new Door[numberOfDoors];
		for (int i = 0; i < numberOfDoors; ++i)
			doors[i] = new Door("Door №" + String.valueOf(i + 1));
	}

	public void open() {
		for (Door d : doors)
			d.open();
	}

	public void close() {
		for (Door d : doors)
			d.close();
	}
}

class MetroStation {
	private String name;

	public MetroStation(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Станція метро " + name;
	}
}

class MetroLine { // Звичайно це совсім не досконалий варіант... Кому не
					// подобається може написати досконаліший:)
	private MetroStation[] stations = new MetroStation[5];
	private int current;
	private boolean forward;

	public MetroLine(String s1, String s2, String s3, String s4, String s5) {
		stations[0] = new MetroStation(s1);
		stations[1] = new MetroStation(s2);
		stations[2] = new MetroStation(s3);
		stations[3] = new MetroStation(s4);
		stations[4] = new MetroStation(s5);
		current = 0;
		forward = true;
	}

	public void move() {
		if (forward)
			++current;
		else
			--current;
		if (current == 4 || current == 0) {
			forward = !forward;
		}
	}

	public String getCurrent() {
		return String.valueOf(stations[current]);
	}

}

/**
 * Клас демонструє побудову класу (вибачте за тавтологію) за допомогою
 * композиції.
 * 
 * @author Владислав
 * 
 */
public class MetroTrain {

	private Engine engine;
	private Doors leftdoors;
	private Doors rightdoors;
	private MetroLine line;

	public MetroTrain(int numberOfDoors, MetroLine line) {
		this.line = line;
		leftdoors = new Doors(numberOfDoors / 2);
		rightdoors = new Doors(numberOfDoors / 2);
		engine = new Engine();

	}

	public void moveFromStationToStation() {
		leftdoors.close();
		engine.move();
		line.move();
	}

	public void StopOnTheStation() {
		engine.stop();
		System.out.println(line.getCurrent());
		leftdoors.open();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MetroLine blue = new MetroLine("Петрівка", "Тараса Шевченка",
				"Контрактова площа", "Поштова площа", "Майдан незалежності");
		MetroTrain train = new MetroTrain(8, blue);

		System.out.println("Move to the centre");
		for (int i = 0; i < 4; ++i) {
			train.StopOnTheStation();
			train.moveFromStationToStation();
		}
		train.StopOnTheStation();
		System.out.println();
		System.out.println();
		System.out.println("Move back");
		for (int i = 0; i < 4; ++i) {
			train.moveFromStationToStation();
			train.StopOnTheStation();
		}

	}

}
