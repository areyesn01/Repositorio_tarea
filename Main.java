import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de numeros que desea introducir: ");
        int longitud = sc.nextInt();

        int[] numeros = new int[longitud];

//Introducimos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número entero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nIntroduce el número que deseas eliminar: ");
        int eliminar = sc.nextInt();


        // Contamos cuántas veces aparece el número a eliminar
        int contador = 0;
        for (int num : numeros) {
            if (num == eliminar) {
                contador++;
            }
        }

        // Creamos un nuevo array sin los números a eliminar
        int[] nuevoArray = new int[numeros.length - contador];
        int index = 0;
        for (int num : numeros) {
            if (num != eliminar) {
                nuevoArray[index++] = num;
            }
        }

        // Mostramos el array final
        System.out.println("\nArray después de eliminar el número:");
        for (int num : nuevoArray) {
            System.out.print("[" + num + "], ");
        }

    }
}