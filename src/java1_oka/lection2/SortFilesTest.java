package java1_oka.lection2;

import java.io.*;

import utils.StdOut;


public class SortFilesTest {

	private static final String testDir = "C:\\Windows";
	
	public static void main(String[] args) {
		File directory = new File(testDir);
		File[] files = directory.listFiles();
		FirstSort.sort(files);
		//ShellSort.sort(files);
		for (int i=0;i<files.length;i++)
			StdOut.println(files[i].getName());
	}

}
