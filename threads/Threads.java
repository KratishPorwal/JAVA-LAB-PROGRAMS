class DisplayBMS extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                // Display "BMS College of Engineering" every 10 seconds
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);  // Sleep for 10 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class DisplayCSE extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                // Display "CSE" every 2 seconds
                System.out.println("CSE");
                Thread.sleep(2000);  // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class threads {
    public static void main(String[] args) {
        // Create instances of both threads
        DisplayBMS threadBMS = new DisplayBMS();
        DisplayCSE threadCSE = new DisplayCSE();

        // Start both threads
        threadBMS.start();
        threadCSE.start();
    }
}