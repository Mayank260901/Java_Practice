package Lab5;

public class sumThread {
	public static void main(String[] args) {
	       
        Thread st = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum =sum + i;
                }
                Result.sum = sum;
            }
            });
        st.start();

        try {
            st.join();
        } catch (Exception e) {
            System.out.println("thread got interrupted.");
        }

        System.out.println(" sum of numbers from 1 to 100 is: " + Result.sum);
        System.out.println("computation completed.");
        }
	static class Result {
		static int sum;
	}
	}


