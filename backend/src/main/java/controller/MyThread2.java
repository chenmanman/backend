package controller;

public class MyThread2 implements Runnable{
	
	public static void main(String[] args) throws InterruptedException{
		
		
		Thread t=new Thread(new MyThread2());
		t.start();
		System.out.print("m1");
		t.join();
		System.out.print("m2");
		
		
		
		
		
		
		
		
			
	}

	@Override
	public void run() {
		System.out.print("r1");
		System.out.print("r2");
		
	}


}
