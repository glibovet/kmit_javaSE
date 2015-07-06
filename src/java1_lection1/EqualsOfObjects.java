package java1_lection1;

public class EqualsOfObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = new String("ab");
		String b = new String("ab");

		if (a == b) {
			System.out.println("Strings is equals");
		} else {
			System.out.println("Strings is not equals");
		}

		StudentClass f = new StudentClass();
		StudentClass z = new StudentClass();

		f.name = "Andrii";
		f.age = 30;
		f.averageGrade = (float) 11.9;

		z.name = "Andrii";
		z.age = 30;
		z.averageGrade = (float) 11.9;

		if (f == z)
			System.out.println("Object is equals");
		else
			System.out.println("Object is not equals");

		if (a.equals(b)) {
			System.out.println("Strings is equals");
		} else
			System.out.println("Strings is not equals");

		if (f.equals(z))
			System.out.println("Object is equals");
		else
			System.out.println("Object is not equals");

		f = z;

		if (f.equals(z))
			System.out.println("Object is equals");
		else
			System.out.println("Object is not equals");

	}

}
