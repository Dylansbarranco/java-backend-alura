public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElplan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "Plus";
//        if (fechaDeLanzamiento >= 2022) {
//            System.out.println("Péliculas más populares");
//        }else {
//            System.out.println("Peliculas Retro que aun vale la pena ver ");
//        }
//        if (incluidoEnElplan || tipoPlan.equals("Plus") ) {
//            System.out.println("Disfruta de tu pelicula");
//        }else {
//            System.out.println("Pelicula no disponible en el plan");
//        }
        if (incluidoEnElplan && tipoPlan.equals("Plus") ) {
            System.out.println("Disfruta de tu pelicula");
        }else {
            System.out.println("Pelicula no disponible en el plan");
        }
        }

    }

