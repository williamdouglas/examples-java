package main.java.thread1;

public class ThreadExample3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Contador());
        Thread t2 = new Thread(new Contador());

        // Assíncronas
        t1.run();
        t2.run();
    }
}

class Contador extends Thread {
    @Override
    public void run() {
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }
}