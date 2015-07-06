package java1_lection1;

public class AssignmentsOfObjercts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st1 = new Student("Ivanov",18,95);
		Student st2 = new Student("Petrov",18,91);

		st1 = st2;
		st1.becomeOlder();
		st2.getAge();
	}

}
