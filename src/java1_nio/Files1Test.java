package java1_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files1Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("test.txt"); 
        Path path2 = Paths.get("C:\\Users\\Andrii\\workspace\\KMIT_JAVA1\\test.txt"); 
 
        System.out.println("Files.isSameFile(path1, path2) is: " 
                + Files.isSameFile(path1, path2)); 

	}

}
