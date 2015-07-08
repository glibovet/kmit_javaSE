package java1_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Path path =Paths.get("C:\\Users\\Andrii\\workspace\\KMIT_JAVA1\\test.txt"); 
	        System.out.printf("Readable: %b, Writable: %b, Executable: %b ", 
	                Files.isReadable(path), Files.isWritable(path), 
	                Files.isExecutable(path));

	}

}
