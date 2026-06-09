import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n=== Calculadora de Tiempo ===");
            System.out.println("1. Horas a minutos");
            System.out.println("2. Minutos a segundos");
            System.out.println("3. Días a horas");
            System.out.println("4. Sumar minutos a una hora");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Función pendiente");
                    break;

                case 2:
                    System.out.println("Función pendiente");
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad de días: ");
                    int dias = input.nextInt();

                    int horas = dias * 24;

                    System.out.println(dias + " días equivalen a "
                            + horas + " horas.");
                    break;

                case 4:
                    System.out.println("Función pendiente");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        input.close();
    }
}