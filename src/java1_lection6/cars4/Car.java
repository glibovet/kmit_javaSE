package java1_lection6.cars4;

interface Car {
	int CARS_NUMBER = 10;// static & final

	String name();

	int getTank();

	void setTank(int i);

	void fillBack(Petrol petrol, int i);
}
