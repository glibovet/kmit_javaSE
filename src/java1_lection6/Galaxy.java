package java1_lection6;

interface Knight {
	public void hit();

	public void defence();
}

interface ForceUser {
	public void push();

	public void pull();

	public void superjump();

	public void sense();
}

interface CanSpeak {
	public void say(String s);
}

class Apprentice implements Knight, CanSpeak {

	@Override
	public void hit() {
		System.out.println("hit");
	}

	@Override
	public void defence() {
		System.out.println("defence");
	}

	@Override
	public void say(String s) {
		System.out.println(s);
	}

}

class JediKnight extends Apprentice implements Knight, ForceUser, CanSpeak {

	@Override
	public void push() {
		System.out.println("pusch");
	}

	@Override
	public void pull() {
		System.out.println("pull");
	}

	@Override
	public void superjump() {
		System.out.println("jump 12x normal jump");
	}

	@Override
	public void sense() {
		System.out.println("sence");
	}
}

/**
 * This class shows us the "multiple inheritance"
 * 
 * @author ���������
 */
public class Galaxy {

	public static void strikeTheEnemy(Knight k) {
		k.hit();
	}

	public static void beAttacked(Knight k) {
		k.defence();
	}

	public static void pushTheEnemy(ForceUser f) {
		f.push();
	}

	public static void pullTheEnemy(ForceUser f) {
		f.pull();
	}

	public static void saySomething(CanSpeak c, String something) {
		c.say(something);
	}

	public static void strikeTheEnemyLikeApprentice(Apprentice a) {
		a.hit();
	}

	public static void beAttackedLikeApprentice(Apprentice a) {
		a.defence();
	}

	public static void saySomethingLikeApprentice(Apprentice a, String something) {
		a.say(something);
	}

	public static void strikeTheEnemyLikeKnight(JediKnight j) {
		j.hit();
	}

	public static void pushTheEnemyLikeKnight(JediKnight j) {
		j.push();
	}

	public static void saySomethingLikeKnight(JediKnight j, String something) {
		j.say(something);
	}

	public static void main(String[] args) {

		JediKnight j_Eneken_Skywalker = new JediKnight();

		strikeTheEnemy(j_Eneken_Skywalker);
		beAttacked(j_Eneken_Skywalker);
		pushTheEnemy(j_Eneken_Skywalker);
		pullTheEnemy(j_Eneken_Skywalker);
		saySomething(j_Eneken_Skywalker,
				"I am using methods which works with my interfaces");

		System.out.println();
		System.out.println();

		strikeTheEnemyLikeApprentice(j_Eneken_Skywalker);
		beAttackedLikeApprentice(j_Eneken_Skywalker);
		saySomethingLikeApprentice(j_Eneken_Skywalker,
				"I am using methods which works with my superclass");

		System.out.println();
		System.out.println();

		strikeTheEnemyLikeKnight(j_Eneken_Skywalker);
		pushTheEnemyLikeKnight(j_Eneken_Skywalker);
		saySomethingLikeKnight(j_Eneken_Skywalker,
				"I am using methods which works with my class");

	}

}
