import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        int opcion;
        do {
            System.out.println("Bienvenidoa la aplicación bancaria");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                        System.out.print("Ingrese la cantidad a ingresar: ");
                    double cantidadIngreso = entrada.nextDouble();
                    saldo += cantidadIngreso;
                    System.out.println("Se han ingresado " + cantidadIngreso + " euros.");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = entrada.nextDouble();
                    if (cantidadRetiro > saldo) {
                        System.out.println("No tiene suficiente saldo para retirar esa cantidad.");
                    } else {
                        saldo -= cantidadRetiro;
                        System.out.println("Se han retirado " + cantidadRetiro + " euros.");
                    }
                    break;

                case 3:
                    System.out.println("Su saldo actual es: " + saldo + " euros.");
                    break;
                case 4:
                    System.out.println("Gracias por usar la aplicación bancaria. ¡Hasta luego!");

            }


        }while (4 != opcion);
    }
}
