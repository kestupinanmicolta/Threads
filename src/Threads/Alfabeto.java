package Threads;

public class Alfabeto extends Thread {
    private char letraFinal;
    private long tiempo;

    public Alfabeto(char letraFinal, long tiempo) {
        this.letraFinal = letraFinal;
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        for (char c = 'A'; c <= letraFinal; c++) {
            System.out.println("Hilo alfabeto ejecutando: " + c);
            System.out.println(c + " ");
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                System.err.println("Error en la ejecución del hilo alfabeto " + e);
            }
        }
        System.out.println("Trabajo del hilo [Alfabeto] terminado");
    }
}
