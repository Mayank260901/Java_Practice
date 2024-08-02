package Lab7;

public class Thread1 extends Thread{
	//run method with for loop to print number extending Thread 
	public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
	public static void main(String[] args) {
		//Object of Thread1 is being created
		Thread1 t = new Thread1();
        t.start();
    }
	}

