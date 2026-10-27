import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = scanner.nextInt();
        int contador = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                contador++;
            }
            i++;
        }
        System.out.println("Cantidad de pares: " + contador);
        scanner.close();
    }

}
