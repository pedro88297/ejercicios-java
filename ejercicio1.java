import java.util.Scanner;

public class ejercicio1 {
    // Versión 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números introducidos:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }

        double media = (double) suma / numeros.length;

        System.out.println("\nSuma: " + suma);
        System.out.println("Media: " + media);
    }

}
