package multiThreading;
import java.util.Random;
	

	public class Thread2 implements Runnable {

	    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
	    Random random = new Random();

	    public void run() {
	        while (true) {
	            int index = random.nextInt(colours.length);
	            String colour = colours[index];
	            System.out.println("Colour: " + colour);

	            if (colour.equals("red")) {
	                System.out.println("Red found! Stopping...");
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Thread2 obj = new Thread2();
	        Thread t = new Thread(obj);
	        t.start();
	    }
	}


