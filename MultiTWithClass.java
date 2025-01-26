class Process1 implements Runnable {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Process 1 : Hello");
        }
    }
}

class Process2 implements Runnable {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Process 2 : JAVA");
        }
    }
}

public class MultiTWithClass {
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
    }
}
