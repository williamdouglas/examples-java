package main.java.thread1;

public class ThreadExample1 {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();

        // Síncronas
        contador1.run();
        contador2.run();
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

// class Contador extends Thread {
//     @Override
//     public void run() {
//         int i = 0;
//         do {
//             i++;
//             System.out.println(i);
//         } while (i < 10);
//     }
// }