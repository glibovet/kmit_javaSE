/**
 * Клас Student для демонстрації специфікаторів доступу
 */
package java1_lection3.access;

public class Student {
	// конструктор класу має специфікатор доступу public і тому
	// доступ до консруктора мають класи, що знаходяться поза межами пакету
	public Student() {
		System.out
				.println("Конструктор Студента ua.com.glybovets.lection5.access");
	}

	// А от цей метод має специфікатор доступу за замовчанням і саме тому не
	// може бути
	// викликаний ззовні пакету
	void enrol() {
		System.out.println("Зарахувати студента");
	}

}
