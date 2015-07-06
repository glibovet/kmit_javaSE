package java1_lection3;

//без імпорту ми не змогли б доступитися до класу за межами нашого пакету
import java1_lection3.access.*;

public class University {

	public static void main(String[] args) {
		// так як конструктор класу студент має специфікатор доступу public
		// ми можемо створити його екземпляр
		Student x = new Student();

		// а от викликати цей метод ми вже не можемо
		// x.enrol();
	}

}
