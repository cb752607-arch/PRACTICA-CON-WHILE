import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroFijo = 50;
        int intento = 0;
        int intentosRealizados = 0;
        while (intento != numeroFijo) {
            System.out.print("Ingrese un número: ");
            intento = scanner.nextInt();
            intentosRealizados++;
            if (intento < numeroFijo) {
                System.out.println("El número es mayor");
            } else if (intento > numeroFijo) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Correcto!");
            }
        }
        System.out.println("Intentos realizados: " + intentosRealizados);
        scanner.close();
    }

}
