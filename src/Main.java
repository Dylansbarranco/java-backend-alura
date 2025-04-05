public class Main {
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
