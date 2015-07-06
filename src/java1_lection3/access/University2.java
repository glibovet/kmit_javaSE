package java1_lection3.access;


public class University2 {

	public static void main(String[] args) {
		// Конструктор класу Student має специфікатор доступу в межах пакету
		// і тому в цьому ж пакеті ми можемо створити його екземпляр
		Student x = new Student();

		// метод enrol також має доступ в межах пакету і ми можемо його
		// викликати
		x.enrol();

	}

}
