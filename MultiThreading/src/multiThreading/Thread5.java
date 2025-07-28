package multiThreading;

public class Thread5 {
	public static void main(String[] args) {
		Runnable task = new MyTask();
		
		Thread t1 = new Thread(task,"High_Priority");
		Thread t2 = new Thread(task,"Norm_Priority");
		Thread t3 = new Thread(task,"Low_Priority");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	static class MyTask implements Runnable{
		public void run() {
			for(int i=0;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+ " -step "+i);
			}
			System.out.println(Thread.currentThread().getName()+ " -finished.\n");
		}
	}
}
