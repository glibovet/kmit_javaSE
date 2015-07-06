package java1_lection1;

public class StudentClass {
	public String name;
	public int age;
	public float averageGrade;

	@Override
	public String toString() {
		return "Name -" + name + ", Age - " + age + ", Average Grade - "
				+ averageGrade;
	}
}
