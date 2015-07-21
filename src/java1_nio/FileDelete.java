package java1_nio;

import java.io.IOException;
import java.nio.file.*;

public class FileDelete {

	public static void main(String[] args) {
		Path pathSource = Paths.get("testCopy2.txt"); 
        try { 
            Files.delete(pathSource); 
            System.out.println("File deleted successfully"); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
	}

}
