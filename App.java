import java.util.Scanner;

public class App {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int tamv = obtenerTamanioArreglo();

        int[] array = llenarArreglo(tamv);

        System.out.println("Mostrando el arreglo:");
        mostrarArreglo(array);

        System.out.println("Mostrando el arreglo invertido:");
        int[] arrayInvertido = invertirArreglo(array);
        mostrarArreglo(arrayInvertido);

    }

    public static int obtenerTamanioArreglo() {
        int tamv;
        do {
            try {
                System.out.println("Ingrese el tamaño del arreglo (de 1 a 16):");
                tamv = leer.nextInt();
                if (tamv < 2 || tamv > 16) {
                    System.out.println("El tamaño debe estar entre 1 y 16.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Por favor, ingrese un número válido.");
                leer.nextLine();
                tamv = -1; // Forzar repetición del bucle
            }
        } while (tamv < 1   || tamv > 16);
        return tamv;
    }

    public static int[] llenarArreglo(int tamv) {
        int[] arreglo = new int[tamv];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el valor [" + i + "]:");
            arreglo[i] = leer.nextInt();
        }
        return arreglo;
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.println(i);
        }
    }

    public static int[] invertirArreglo(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }
}

