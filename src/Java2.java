/*
 * 🌡️ Conversor y ejercicios matemáticos en Java
 *
 * Este programa incluye una serie de ejercicios básicos que demuestran el uso de:
 * - Variables primitivas (int, double, boolean)
 * - Conversión de tipos (casting)
 * - Operaciones matemáticas
 * - Uso de constantes como Math.PI y Math.pow
 *
 * Es parte de mi proceso de formación en Java, practicando lógica y fundamentos.
 */

public class Java2 {
    public static void main(String[] args) {

        // Ejercicio 0: Celsius a Fahrenheit
        double temperatura = 35.5;
        System.out.println("Temperatura en grados Celsius es: " + temperatura);
        int temperatura_grados = (int) (temperatura * 1.8 + 32);
        System.out.println("La temperatura en grados Fahrenheit es: " + temperatura_grados);

        // Ejercicio 1: Kilómetros a millas
        System.out.println("Conversión de distancia");
        double kilometros = 10.0;
        System.out.println("Kilómetros: " + kilometros);
        int millas = (int) (kilometros * 0.621371); // 1 km = 0.621371 millas
        System.out.println("Millas: " + millas);

        // Ejercicio 2: Área de un círculo
        System.out.println("Área de un círculo");
        double radio = 7.5;
        System.out.println("Radio: " + radio);
        int area = (int) (Math.PI * Math.pow(radio, 2)); // Área = π * r²
        System.out.println("Área: " + area);

        // Ejercicio 3: Fahrenheit a Celsius
        System.out.println("Conversión de grados");
        double fahrenheit = 98.6;
        System.out.println("Fahrenheit: " + fahrenheit);
        int celsius = (int) (fahrenheit - 32) * 5 / 9; // Fórmula clásica
        System.out.println("Celsius: " + celsius);

        // Ejercicio 4: Cálculo de propina
        System.out.println("Cálculo de propina");
        double cuenta = 42.75;
        double porcentajePropina = 15;
        int propina = (int) (cuenta * porcentajePropina) / 100;
        int total = (int) (cuenta + propina);
        System.out.println("Total con propina: " + total);

        // Ejercicio 5: Casting múltiple (casting loco)
        System.out.println("Casting loco");
        double numeroOriginal = 23.9876;
        System.out.println("Número original: " + numeroOriginal);

        // Se convierte el número a int (pierde decimales) y se le suma 2
        int conversor = (int) (numeroOriginal) + 2;
        System.out.println("Le sumamos un valor: " + conversor);

        // Se vuelve a convertir a double
        double numeroConvertido = (double) (conversor - 2);
        System.out.println("Número convertido: " + numeroConvertido);
    }
}
