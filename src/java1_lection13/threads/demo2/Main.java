package java1_lection13.threads.demo2;

import java.util.Random;

public class Main {
	
	private static int mNum=12;
	private static ThreadLocal<Integer> threadLocal =
    	new ThreadLocal<Integer>(){
        @Override
        	protected Integer initialValue(){
        		return new Random().nextInt(100);
        	}
    	};

    public static void main(String[] args) {
        threadLocal.set(new Random().nextInt(100));
        mNum=13;
		Runnable runner = new Runnable(){
                    public void run(){
                        threadLocal.set(new Random().nextInt(100));
                        mNum++;
              	        System.out.println("Thread " +
                                Thread.currentThread().getName() + ", value is " + threadLocal.get()+", mNum ="+mNum);
                    }
		};

		for (int i=0; i<3; i++)
			(new Thread (runner)).start();

		System.out.println("Main Thread, value is " +	threadLocal.get()+", mNum ="+mNum);
	}
}
