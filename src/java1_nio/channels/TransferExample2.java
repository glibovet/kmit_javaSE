package java1_nio.channels;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TransferExample2 {
	public static void main(String[] args) {
		try{
			RandomAccessFile fromFile = new RandomAccessFile("test.txt", "rw"); 
			FileChannel fromChannel = fromFile.getChannel();
			RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw"); 
			FileChannel toChannel = toFile.getChannel(); 
			long position = 0; 
			long count = fromChannel.size(); 
			fromChannel.transferTo(position, count, toChannel);
		}catch (IOException ex){
			ex.printStackTrace();
		}
	}
}
