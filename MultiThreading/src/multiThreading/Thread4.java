package multiThreading;

public class Thread4 {
	public static void main(String[] args) {
		
		Thread evenThread = new Thread(()->{
			System.out.println("---Even Numbers[1-20]---");
			for(int i=1;i<=20;i++) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
			System.out.println("\n");
		});
		
		Thread oddThread = new Thread(()->{
			System.out.println("---Odd Numbers[1-20]---");
			for(int i=1;i<=20;i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		});
		
		evenThread.start();
		
		try {
			evenThread.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		oddThread.start();
		
	}
}
