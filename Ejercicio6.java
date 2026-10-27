import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int cantidad = 0;
        int temp = numero;
        while (temp > 0) {
            temp = temp / 10;
            cantidad++;
        }
        System.out.println("Cantidad de dígitos: " + cantidad);
        scanner.close();
    }

}
