import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días: ");
        int dias = input.nextInt();

        int horas = dias * 24;

        System.out.println(dias + " días equivalen a " + horas + " horas.");

        input.close();
    }
}