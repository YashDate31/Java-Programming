class EvenThread extends Thread {

    public void run() {
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100);   // relinquish control
                } catch(Exception e) {}
            }
        }
    }
}

class OddThread extends Thread {

    public void run() {
        for(int i = 1; i <= 50; i++) {
            if(i % 2 != 0) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100);   // relinquish control
                } catch(Exception e) {}
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String args[]) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}