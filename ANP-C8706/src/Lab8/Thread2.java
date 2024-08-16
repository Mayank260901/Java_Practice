package Lab8;

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
    	// Create an instance of the Thread2 class
        Thread2 t = new Thread2();
        Thread t2 = new Thread(t);
        t2.start();
    }
}