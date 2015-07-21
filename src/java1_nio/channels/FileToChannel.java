package java1_nio.channels;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileToChannel {

	public static void main(String[] args){
		try {
			RandomAccessFile aFile = new RandomAccessFile("test.txt", "rw"); 
			FileChannel inChannel = aFile.getChannel(); 
			ByteBuffer buf = ByteBuffer.allocate(48); 
			int bytesRead;
			bytesRead = inChannel.read(buf);
			while (bytesRead != -1) { 
				System.out.println("Read " + bytesRead); 
				buf.flip(); 
				while(buf.hasRemaining()){ 
					System.out.print((char) buf.get()); 
				} 
				buf.clear(); 
				bytesRead = inChannel.read(buf); 
			} 
			aFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
