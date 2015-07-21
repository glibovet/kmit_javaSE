package java1_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {

	public static void main(String[] args) {
		Path pathSource = Paths.get("test.txt"); 
        Path pathDestination = Paths.get("testCopy.txt"); 
        try { 
            Files.copy(pathSource, pathDestination); 
            System.out.println("Source file copied successfully"); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 

	}

}
