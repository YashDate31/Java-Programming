package Manual.Unit_2_OOP_and_Exceptions.Pr11_Multithreading;

class NumberPrinter extends Thread {
    private final String label;

    NumberPrinter(String label) {
        this.label = label;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(label + " -> " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter("Thread-1");
        NumberPrinter t2 = new NumberPrinter("Thread-2");

        t1.start();
        t2.start();
    }
}
