import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la edad " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        System.out.println("Edades:");
        for (int e : edades) {
            System.out.print(e + " ");
        }
        int min = edades[0];
        int max = edades[0];

        for (int e : edades) {
            if (e < min)
                min = e;
            if (e > max)
                max = e;
        }

        System.out.println("\nEdad mínima: " + min);
        System.out.println("Edad máxima: " + max);

        int mayores = 0;
        int menores = 0;

        for (int e : edades) {
            if (e >= 18)
                mayores++;
            else
                menores++;
        }

        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);

        int suma = 0;
        for (int e : edades)
            suma += e;

        double media = (double) suma / edades.length;
        System.out.println("Media: " + media);

        Arrays.sort(edades);

        System.out.println("Ordenadas:");
        for (int e : edades) {
            System.out.print(e + " ");
        }
    }
}
