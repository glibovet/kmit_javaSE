package java1_lection1;

import utils.*;

public class EffectiveArray {

	private static final int SENTINEL = -1;
	private static final int MAX_SIZE = 500;

	public static void main(String[] args) {
		int[] mid = new int[MAX_SIZE];
		int numScores = 0;
		while (true) {

			int score = DataInput.getInt("?");
			if (score == SENTINEL)
				break;
			mid[numScores++] = score;
			
		}
	}

}
