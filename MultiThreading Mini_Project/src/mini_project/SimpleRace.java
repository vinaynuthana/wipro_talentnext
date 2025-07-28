package mini_project;

public class SimpleRace {

	    private static volatile boolean raceWon = false;

	    public static void main(String[] args) {
	        Runnable tortoise = () -> {
	            for (int distance = 1; distance <= 100; distance++) {
	                if (raceWon) break;
	                System.out.println("Tortoise has run " + distance + " meters.");
	                if (distance == 100 && !raceWon) {
	                    raceWon = true;
	                    System.out.println("\n** TORTOISE WINS THE RACE! **\n");
	                }
	            }
	        };

	        Runnable hare = () -> {
	            for (int distance = 1; distance <= 100; distance++) {
	                if (raceWon) break;
	                System.out.println("Hare has run " + distance + " meters.");
	                if (distance == 60) {
	                    try {
	                        System.out.println(">> The Hare is napping... <<");
	                        Thread.sleep(1000);
	                    } catch (InterruptedException e) {
	                        Thread.currentThread().interrupt();
	                    }
	                }
	                if (distance == 100 && !raceWon) {
	                    raceWon = true;
	                    System.out.println("\n** HARE WINS THE RACE! **\n");
	                }
	            }
	        };

	        Thread tortoiseThread = new Thread(tortoise);
	        Thread hareThread = new Thread(hare);

	        tortoiseThread.setPriority(Thread.MIN_PRIORITY);
	        hareThread.setPriority(Thread.MAX_PRIORITY);

	        System.out.println("Race is starting... 3... 2... 1... GO!\n");
	        hareThread.start();
	        tortoiseThread.start();
	    }
	
}
