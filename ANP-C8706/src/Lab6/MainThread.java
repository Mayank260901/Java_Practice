package Lab6;

public class MainThread {
	public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
        //As I have learnt new functionality today of currentThread() so using it.

        Thread.currentThread().setName("MainThread");
        for (int i = 61; i <= 80; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
