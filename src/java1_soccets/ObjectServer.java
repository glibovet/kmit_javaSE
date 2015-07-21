package java1_soccets;
import java.io.*;
import java.net.*;

public class ObjectServer {
	public static final int PORT = 8080;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket s = new ServerSocket(PORT);
		System.out.println("Ми запустили сервер " +s);
		
		try{
			Socket socket = s.accept();
			try{
				System.out.println("Встановили з'єднання: "+socket);
				ObjectInputStream oin = new ObjectInputStream(socket.getInputStream());
				TestStudent ts = (TestStudent) oin.readObject();
				System.out.println(ts);
				oin.close();
			}finally{
				System.out.println("Сервер закрив сокет ...");
				socket.close();
			}
		}finally{
			s.close();
		}
	}
}
