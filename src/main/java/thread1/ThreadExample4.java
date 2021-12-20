package main.java.thread1;

public class ThreadExample4 {
    public static void main(String[] args) {
        GeradorPDF gpdf = new GeradorPDF();
        BarraDeCarregamento bc = new BarraDeCarregamento(gpdf);

        gpdf.start();
        bc.start();
    }
}

class GeradorPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Iniciando geração de pdf.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado.");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread target) {
        this.iniciarGeradorPDF = target;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (!iniciarGeradorPDF.isAlive()) {
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}