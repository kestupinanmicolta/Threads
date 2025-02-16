package Threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el número a realizarle el conteo regresivo: ");
            int numero = scanner.nextInt();
            System.out.println("Ingrese una letra del alfabeto (A-Z): ");
            char letra = scanner.next().toUpperCase().charAt(0);
            ConteoRegresivo conteo = new ConteoRegresivo(numero, 500);
            Alfabeto alfabeto = new Alfabeto(letra, 600);
            alfabeto.start();
            conteo.start();
        } catch (Exception e) {
            System.err.println("Haz ingresado un valor inválido en la letra o número " + e);
        }
    }
}
