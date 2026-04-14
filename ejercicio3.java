import java.util.ArrayList;
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

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int n : numerosAleatorios) {
            if (n % 2 == 0)
                pares.add(n);
            else
                impares.add(n);
        }
    }

}
