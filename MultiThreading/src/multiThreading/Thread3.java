package multiThreading;
public class Thread3{

    public static void main(String[] args) {
        Thread printing = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);

                    if (i == 5) {
                        Thread.sleep(5000);
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        printing.start();
    }
}
