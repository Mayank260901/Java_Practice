package Lab6;

class Thread1 extends Thread {
    public void run() {
        this.setName("Thread1");
        for (int i = 1; i <= 20; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}
