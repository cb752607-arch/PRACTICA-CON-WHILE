import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        int retiro = -1;
        while (retiro != 0) {
            System.out.println("Saldo actual: S/" + saldo);
            System.out.print("Retiro (ingrese 0 para salir): ");
            retiro = scanner.nextInt();
            if (retiro == 0) {
                break;
            }
            if (retiro > saldo) {
                System.out.println("Error: El retiro es mayor al saldo.");
            } else {
                saldo -= retiro;
                System.out.println("Saldo restante: S/" + saldo);
            }
        }
        scanner.close();
    }

}
