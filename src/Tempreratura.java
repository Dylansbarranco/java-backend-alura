public class Tempreratura {
    public static void main(String[] args) {
        double temperatura = 35.5;
        System.out.println("temperatura en grados Celsius es: " + temperatura);
        int temperatura_grados = (int) (temperatura * 1.8+32);
        System.out.println("La temperatura en grados Faherenheit es: : " + temperatura_grados);

        System.out.println("conversión de distancia");
        // Ejercicio 1: Kilómetros a millas
        double kilometros = 10.0;
        System.out.println("Kilometros es: "+kilometros);
        int  millas = (int) (kilometros * 0.621371 );
        System.out.println("millas: " + millas);
        System.out.println("Área de un círculo");
        // Ejercicio 2: Área del círculo
        double radio = 7.5;
        System.out.println("radio es: "+radio);
        int area= (int) (Math.PI*Math.pow(radio,2));
        System.out.println("area: "+area);
        System.out.println("Conversión de grados");
        // Ejercicio 3: Fahrenheit a Celsius
        double fahrenheit = 98.6;
        System.out.println("fahrenheit: "+fahrenheit);
        int celsius = (int) (fahrenheit - 32) * 5/9;
        System.out.println("celsius: "+celsius);
        System.out.println("Calculo de propina");
        // Ejercicio 4: Propina
        double cuenta = 42.75;
        double porcentajePropina = 15;
        int Propina = (int) (cuenta*porcentajePropina)/100;
        int total = (int) (cuenta+Propina);
        System.out.println("total: "+total);
        System.out.println("Casting loco");
        // Ejercicio 5: Casting múltiple
        double numeroOriginal = 23.9876;
        System.out.println("numeroOriginal: "+numeroOriginal);
        int conversor = (int) (numeroOriginal )+2;
        System.out.println(" le sumamor un valor: "+conversor);
        double numeroConvertido = (double) (conversor - 2);
        System.out.println("numeroConvertido: "+numeroConvertido);

    }
}
