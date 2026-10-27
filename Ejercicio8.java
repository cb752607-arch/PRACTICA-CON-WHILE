import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cantidad de términos: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        int i = 1;
        System.out.print("Secuencia: ");
        while (i <= n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        }
        scanner.close();
    }

}
