import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int i = 1;
        while (i <= 5) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
            i++;
        }
        double promedio = suma / 5;
        System.out.println("Promedio: " + promedio);
        scanner.close();
    }

}
