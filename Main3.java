import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int [] numeros = new int[10];




        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = r.nextInt(100)+1;
        }

        System.out.print("\nIntroduce el número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número no encontrado en el array.");
        }

    }
}