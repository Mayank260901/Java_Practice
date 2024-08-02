package Lab6;

class Thread2 extends Thread {
    public void run() {
        this.setName("Thread2");
        for (int i = 21; i <= 60; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}
