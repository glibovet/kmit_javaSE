package java1_nio;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Перевірка для файлу
		//Path path = Paths.get("C:\\Users\\Andrii\\workspace\\KMIT_JAVA1\\test.txt"); 
         
        //Перевірка для директорії 
        Path path = Paths.get("C:\\Users\\Andrii\\workspace\\KMIT_JAVA1");
         
        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) { 
            System.out.println("The file/directory " + path.getFileName() 
                    + " exists"); 
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) { 
                System.out.println(path.getFileName() + " is a directory"); 
            } else { 
                System.out.println(path.getFileName() + " is a file"); 
            } 
        } else { 
            System.out.println("The file/directory " + path.getFileName() + " does not exist"); 
        } 

	}

}
