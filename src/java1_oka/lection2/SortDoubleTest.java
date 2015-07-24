package java1_oka.lection2;

import utils.StdOut;
import utils.StdRandom;

public class SortDoubleTest {

	public static final int n = 10;
	
	public static void main(String[] args) {
		Double[] a = new Double[n];
		for (int i = 0;i<n;i++)
			a[i]= StdRandom.uniform();
		FirstSort.sort(a);
		for (int i = 0; i<n;i++)
			StdOut.println(a[i]);
	}

}
