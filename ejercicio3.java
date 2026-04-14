import java.util.Arrays;
import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < 10; i++) {
            numerosAleatorios[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Array:");
        for (int n : numerosAleatorios) {
            System.out.print(n + " ");
        }

        Arrays.sort(numerosAleatorios);

        System.out.println("\nArray ordenado (mayor a menor):");
        for (int i = numerosAleatorios.length - 1; i >= 0; i--) {
            System.out.print(numerosAleatorios[i] + " ");
        }

        System.out.println("\nNúmeros pares:");

        for (int i = numerosAleatorios.length - 1; i >= 0; i--) {
            if (numerosAleatorios[i] % 2 == 0) {
                System.out.print(numerosAleatorios[i] + " ");
            }
        }

        int suma = 0;
        for (int n : numerosAleatorios)
            suma += n;

        double media = (double) suma / numerosAleatorios.length;
        System.out.println("Media: " + media);
    }

}
