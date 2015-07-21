package java1_soccets;
import java.net.*;
import java.io.*;

public class ContentURL {
	public static void main(String[] args) throws IOException {
		
		int c;
		URL hp = new URL("http://ya.ru/");
		URLConnection hpCon = hp.openConnection();
		
		System.out.println("Date: " + hpCon.getDate());
	    System.out.println("Type: " + hpCon.getContentType());
	    System.out.println("Exp: " + hpCon.getExpiration());
	    System.out.println( "Last M: " + hpCon.getLastModified());
	    System.out.println("Length: " + hpCon.getContentLength());
	    if (hpCon.getContentLength() > 0) 
	    {
	      System.out.println("=== Зміст ===");
	      InputStream input = hpCon.getInputStream();
	      int i=hpCon.getContentLength();
	      while (((c = input.read()) != -1) && (--i > 0)) 
	      {
	        System.out.print((char) c);
	      }
	    input.close();
	    }
	    else 
	    {
	      System.out.println("No Content Available");
	    }

	}

}
