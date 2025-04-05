/*
 * 🎬 Screen Math - Mini proyecto Java
 *
 * Este es un ejercicio práctico hecho como parte de mi formación en Java.
 * El programa simula una pequeña aplicación de consola llamada "Screen Math",
 * que muestra información de una película (en este caso, Matrix) y realiza operaciones como:
 *
 * - Mostrar sinopsis y datos técnicos 📄
 * - Calcular la media de puntuaciones dadas por el usuario 🎯
 * - Convertir esa media en una clasificación de estrellas ⭐
 * - Explorar conceptos como tipado, casting y uso de String multilínea
 *
 * Una forma divertida de unir cine y programación mientras practico lógica y sintaxis en Java ☕.
 */

public class Java1 {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) s Screen Math");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElplan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0 )/3;

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fué lanzada en: """ + " " +fechaDeLanzamiento;

        System.out.println("sinopsis: " + sinopsis);

        // conversion de tipos de datos
        int clasificacion = (int) (media / 2);
        System.out.println("clasificacion: " + clasificacion);

    }
}
