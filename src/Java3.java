/*
 * 🎬 Ejercicio de decisiones condicionales en Java
 *
 * Este programa demuestra cómo usar estructuras de control como `if`, `else`,
 * y operadores lógicos (`||` y `&&`) para tomar decisiones en base a variables.
 *
 * Se simula un sistema que muestra si una película está disponible
 * dependiendo de su fecha de lanzamiento y del tipo de plan del usuario.
 */

public class Java3 {
    public static void main(String[] args) {

        // Datos de ejemplo sobre una película
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElplan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "Plus";

        // --- Condición 1: ¿Es una película reciente o retro?
        /*
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Películas más populares");
        } else {
            System.out.println("Películas retro que aún vale la pena ver");
        }
        */

        // --- Condición 2: ¿El usuario puede ver la película con su plan?
        // Opción con operador lógico OR (||): basta con que cumpla una de las dos condiciones
        /*
        if (incluidoEnElplan || tipoPlan.equals("Plus") ) {
            System.out.println("Disfruta de tu película");
        } else {
            System.out.println("Película no disponible en el plan");
        }
        */

        // --- Condición 3: Versión actual del código (AND lógico)
        // Requiere que la película esté incluida EN el plan y que el tipo de plan sea "Plus"
        if (incluidoEnElplan && tipoPlan.equals("Plus")) {
            System.out.println("Disfruta de tu película");
        } else {
            System.out.println("Película no disponible en el plan");
        }
    }
}
