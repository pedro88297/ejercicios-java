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

        int r1 = 0, r2 = 0, r3 = 0, r4 = 0;

        for (int e : edades) {
            if (e <= 17)
                r1++;
            else if (e <= 30)
                r2++;
            else if (e <= 50)
                r3++;
            else
                r4++;
        }

        System.out.println("0-17: " + r1);
        System.out.println("18-30: " + r2);
        System.out.println("31-50: " + r3);
        System.out.println("51+: " + r4);

        boolean todosMayores = true;

        for (int e : edades) {
            if (e < 18) {
                todosMayores = false;
                break;
            }
        }

        System.out.println("¿Todos mayores?: " + todosMayores);
    }
}
