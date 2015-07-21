package java1_nio.channels;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client implements Runnable{
  private String host;
  private int port;
  private String[] data;

  public Client( String host, int port, int numThreads , String[] data) {
    this.host = host;
    this.port = port;
    this.data = data;

    for (int i=0; i<numThreads; ++i) {
      new Thread( this ).start();
    }
  }

  public void run() {
    try {
      Socket s = new Socket( host, port );

      InputStream in = s.getInputStream();
      OutputStream out = s.getOutputStream();

      for (int i=0;i<data.length;i++) {
        System.out.println("Transferring data");
        char[] charBuffer = data[i].toCharArray();
        byte[] b = new byte[charBuffer.length];
        for (int j = 0; j < b.length; j++) {
        	b[j] = (byte) charBuffer[j];
        }
        out.write(b);
        int sofar = 0;
        while (sofar < b.length) {
          sofar += in.read(b);
        }

        System.out.println( Thread.currentThread()+" wrote "+data[i] );
        System.out.println("Received data");
        System.out.println(new String(b));

        try { 
        	Thread.sleep( 100 ); 
        } catch( InterruptedException ie ) {}
      }
    } catch( IOException ie ) {
      ie.printStackTrace();
    }
  }

  static public void main( String args[] ) throws Exception {
	  String host="127.0.0.1";
	  int port = Server.PORT;
	  int numThreads = 1;
	  if (args!=null&&args.length==3){
		  host = args[0];
		  port = Integer.parseInt( args[1] );
		  numThreads = Integer.parseInt( args[2] );
	  }
	  String[] data = new String[]{"Java great", "Nio is a power", "It is hard"};
	  new Client( host, port, numThreads, data);
  }
}
