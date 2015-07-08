package java1_nio;

import java.nio.file.*;

public class Path1Test {

	public static void main(String[] args) {
		
        //Створення об'єкту Path через виклик статичного методу get() класу Paths
        Path testFilePath = Paths.get("C:\\test\\test2\\testfile.txt"); 
 
        //Виводимо інформацію про файл 
        System.out.println("Printing file information: "); 
        System.out.println("\t file name: " + testFilePath.getFileName()); 
        System.out.println("\t root of the path: " + testFilePath.getRoot()); 
        System.out.println("\t parent of the target: " 
                + testFilePath.getParent()); 
 
        //Вивід елементів шляху
        System.out.println("Printing elements of the path: "); 
        for (Path element : testFilePath) { 
            System.out.println("\t path element: " + element); 
        } 

	}

}
