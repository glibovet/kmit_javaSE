package java1_nio.channels;

import java.io.*;
import java.nio.channels.*;

public class TransferExample {

	public static void main(String[] args) {
		try{
			RandomAccessFile fromFile = new RandomAccessFile("test.txt", "rw"); 
			FileChannel fromChannel = fromFile.getChannel();
			RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw"); 
			FileChannel toChannel = toFile.getChannel(); 
			long position = 0; 
			long count = fromChannel.size(); 
			toChannel.transferFrom(fromChannel, position, count);
		}catch (IOException ex){
			ex.printStackTrace();
		}
	}

}
