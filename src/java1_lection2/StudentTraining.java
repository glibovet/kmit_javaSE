package java1_lection2;

/**
 * Приклад потужності ключового слова this
 */
class Studying {
	public void train(StudentN student) {
		StudentN trained = student.getTraining();
		if (trained.training == true)
			System.out.println("Ура я навчив студента " + trained.name);
		else
			System.out.println("Не вдалося навчити студента " + trained.name);
	}
}

class Training {
	static StudentN teach(StudentN student) {
		student.training = true;
		return student;
	}
}

class StudentN {
	String name;
	boolean training;

	StudentN(String n) {
		name = n;
		training = false;
	}

	StudentN getTraining() {
		return Training.teach(this);
	}
}

public class StudentTraining {
	public static void main(String[] args) {
		new Studying().train(new StudentN("Сідоров"));
	}
}
