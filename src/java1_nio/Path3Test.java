package java1_nio;
import java.nio.file.*;
public class Path3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path path1 = Paths.get("testfile.txt"); 
        Path path2 = Paths.get("C:\\Users\\Andrii\\workspace\\KMIT_JAVA1\\testfile.txt");  
        System.out.println("(path1.compareTo(path2) == 0) is: " 
                + (path1.compareTo(path2) == 0)); 
        System.out.println("path1.equals(path2) is: " + path1.equals(path2)); 
        System.out.println("path2.equals(path1.toAbsolutePath()) is " 
                + path2.equals(path1.toAbsolutePath())); 
         
        System.out.println(path1.toAbsolutePath()); 

	}

}
