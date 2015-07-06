package java1_lection4;

class Faculty {

	private String facultyName;

	Faculty(String name) {
		facultyName = name;
	}

	@Override
	public String toString() {
		return "Факультет:" + facultyName;
	}
}

public class University {

	private String universityName;
	private int numberOfFaculties;
	private Faculty[] faculties;
	private int facultyAdds = 0;

	University(String name, int number) {
		faculties = new Faculty[number];
		numberOfFaculties = number;
		universityName = name;
	}

	public boolean addFaculty(String name) {
		if (facultyAdds < numberOfFaculties) {
			faculties[facultyAdds++] = new Faculty(name);
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		String facultiesString = "";
		for (int i = 0; i < numberOfFaculties; i++) {
			facultiesString += faculties[i] + " ";
		}
		return "Університет " + universityName + " має " + numberOfFaculties
				+ " факультетів. \n Серед них: " + facultiesString;
	}

	public static void main(String[] args) {

		University ukma = new University("НаУКМА", 3);
		ukma.addFaculty("Fi");
		ukma.addFaculty("FGSN");
		ukma.addFaculty("Fl");
		System.out.println(ukma);
	}

}
