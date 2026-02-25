import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas edades desea introducir? ");
        int n = sc.nextInt();
        int edades [] = new int[n];

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Introduce una edad: ");
            edades [i] = sc.nextInt();
        }

        boolean todasMayores = true;

        for (int edad : edades) {
            if (edad < 18) {
                todasMayores = false;
                break;
            }
        }

        System.out.println("\n¿Todas las personas son mayores de edad? " + todasMayores);

    }
}