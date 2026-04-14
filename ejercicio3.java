import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
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

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] == buscar) {
                System.out.println("Encontrado en posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No existe");
        }
    }

}
