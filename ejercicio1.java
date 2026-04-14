import java.util.ArrayList;
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

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            System.out.println(numeros[i] + " aparece " + contador + " veces");
        }

        System.out.print("Número a eliminar: ");
        int eliminar = sc.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();

        for (int num : numeros) {
            if (num != eliminar) {
                lista.add(num);
            }
        }

        System.out.println("Resultado:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }

}
