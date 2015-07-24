package java1_oka.lection2;

import java.io.*;

import utils.In;
import utils.StdOut;

public class SortStringsTest {

	private static final String testFile = "words3.txt"; // ���� � �������
	
	public static void main(String[] args) throws FileNotFoundException {
		String[] a = In.readStrings(testFile);
		FirstSort.sort(a);
		for (int i=0;i<a.length;i++)
			StdOut.println(a[i]);
	}

}
