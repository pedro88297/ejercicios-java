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
    }

}
