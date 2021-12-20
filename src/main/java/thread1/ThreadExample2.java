package main.java.thread1;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Contador());
        Thread thread2 = new Thread(new Contador());

        // Assíncronas
        thread1.start();
        thread2.start();
    }
}

class Contador implements Runnable {
    @Override
    public void run() {
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }
}