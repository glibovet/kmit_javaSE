package java1_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMove {

	public static void main(String[] args) {
		Path pathSource = Paths.get("testCopy.txt"); 
        Path pathDestination = Paths.get("testCopy2.txt"); 
        try { 
            Files.move(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING); 
            System.out.println("Source file moved successfully"); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 

	}

}
