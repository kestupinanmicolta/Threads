package Threads;

public class ConteoRegresivo extends Thread {
    public int numero;
    private long tiempo;

    public ConteoRegresivo(int numero, long tiempo) {
        this.numero = numero;
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        for (int i = numero; i >= 0; i--) {
            System.out.println("Hilo conteo regresivo ejecutando: " + i);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                System.err.println("Error en la ejecución del hilo conteo regresivo " + e);
            }
        }
        System.out.println("Trabajo del hilo [ConteoRegresivo] terminado");
    }
}
