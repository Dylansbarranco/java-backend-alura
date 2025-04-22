import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Es segura tu contraseña");
        String contraseña = sc.nextLine();

        if (contraseña.length() >= 8) {

         if (contraseña.contains("A") || contraseña.contains("E") || contraseña.contains("I") || contraseña.contains("O") || contraseña.contains("U")) {
             if (contraseña.matches(".*\\d.*")) {
                 System.out.println("Tu contraseña es segura");
              }
          }

        } else
            System.out.println("Tu contraseña no es segura");
    }

}

