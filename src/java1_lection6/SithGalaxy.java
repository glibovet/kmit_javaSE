package java1_lection6;

interface DangerousKnight extends Knight {
	public void combatTrick();
}

interface DarkForceUser extends ForceUser {
	public void lightningStrike();

	public void choke();
}

interface Sith extends DangerousKnight, DarkForceUser {
	public void kill_the_innocent();
}

class DarkApprentice extends JediKnight implements DangerousKnight {

	@Override
	public void combatTrick() {
		System.out.println("I use dangerous combat trick");
	}
}

class SithLord extends DarkApprentice implements Sith {

	@Override
	public void lightningStrike() {
		System.out.println("lighting strike");
	}

	@Override
	public void choke() {
		System.out.println("i choke the enemy");
	}

	@Override
	public void push() {
		System.out.println("My push is more powerful then jedy use");
	}

	@Override
	public void pull() {
		System.out.println("My pull is more powerful then jedy use");
	}

	@Override
	public void superjump() {
		System.out.println("My jump is much higher then jedy use");
	}

	@Override
	public void sense() {
		System.out.println("My sence is better then jedy use");
	}

	@Override
	public void kill_the_innocent() {
		System.out.println("Ha-ha-ha! I killed the innocent!");
	}

}

/**
 * This class shows us the inheritance of the interfaces
 * 
 * @author ���������
 */
public class SithGalaxy {

	public static void strikeTheEnemy(Knight k) {
		k.hit();
	}

	public static void strikeTheEnemyLikeDangerousKnight(DangerousKnight d) {
		d.hit();
		d.combatTrick();
	}

	public static void atackTheEnemyWithForce(ForceUser f) {
		f.push();
		f.pull();
		f.superjump();
	}

	public static void atackTheEnemyWithDarkForce(DarkForceUser d) {
		d.push();
		d.pull();
		d.superjump();
		d.lightningStrike();
	}

	public static void murder(Sith s) {
		s.kill_the_innocent();
	}

	public static void main(String args[]) {

		// The epic fight

		Apprentice a = new Apprentice();
		JediKnight j = new JediKnight();
		DarkApprentice d = new DarkApprentice();
		SithLord s = new SithLord();

		System.out.println("The DarkApprentice fight with apprentice");
		System.out.println();

		System.out.println("Apprentice atack:");
		strikeTheEnemy(a);
		strikeTheEnemy(a);

		System.out.println("DarkApprentice atack:");
		strikeTheEnemy(d);
		strikeTheEnemyLikeDangerousKnight(d);

		System.out.println();
		System.out.println();

		System.out.println("The Sith Lord fights with jedi knight");
		System.out.println();

		System.out.println("JediKnight atack:");
		strikeTheEnemy(j);
		atackTheEnemyWithForce(j);

		System.out.println();
		System.out.println();

		System.out.println("SithLord  atack:");
		strikeTheEnemyLikeDangerousKnight(s);
		atackTheEnemyWithDarkForce(s);

		System.out.println();

		System.out.println("SithLord  kill jedyknight:");
		murder(s);
		j = null; // b is murdered

		System.out.println();
		System.out.println();
		System.out
				.println("The Sith Lord returns to help hith apprentice kill weak jedy appretice");
		System.out.println();

		System.out.println("SithLord  atack:");
		atackTheEnemyWithDarkForce(s);

		System.out.println();

		System.out.println("SithLord  kill apprentice:");
		murder(s);
		a = null; // a is murdered;

		// The evil wins :)
	}

}
