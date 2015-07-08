package java1_nio;

import java.io.IOException;
import java.nio.file.*;

public class Path2Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
       Path testFilePath = Paths.get(".\\test.txt"); 
        
       System.out.println("The file name is: " + testFilePath.getFileName()); 
       System.out.println("It's URI is: " + testFilePath.toUri()); 
       System.out.println("It's absolute path is: " 
               + testFilePath.toAbsolutePath()); 
       System.out.println("It's normalized path is: " 
               + testFilePath.normalize()); 

       Path testPathNormalized = Paths 
               .get(testFilePath.normalize().toString()); 
       System.out.println("It's normalized absolute path is: " 
               + testPathNormalized.toAbsolutePath()); 
       System.out.println("It's normalized real path is: " 
               + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS)); 

	}

}
