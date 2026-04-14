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

        int mayor = numeros[0];
        int menor = numeros[0];
        int positivos = 0;
        int negativos = 0;

        for (int n : numeros) {
            if (n > mayor)
                mayor = n;
            if (n < menor)
                menor = n;
            if (n > 0)
                positivos++;
            if (n < 0)
                negativos++;
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        System.out.print("¿Cuántos números quieres introducir?: ");
        int n = sc.nextInt();

        int[] numeros1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros1[i] = sc.nextInt();
        }

    }

}
