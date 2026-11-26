// Ejercicio 62 Tarifa Transporte
import java.util.Scanner; 

public class Ejercicio_62_Tarifa_Transporte {
    public static void main(String[] args) {

        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);

        // Solicitar los valores de entrada
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Es estudiante? (S/N): ");
        String estudiante = sc.next().toUpperCase();

        System.out.print("¿Es horario pico? (S/N): ");
        String horarioPico = sc.next().toUpperCase();

        System.out.print("Ingrese la tarifa base: ");
        double tarifaBase = sc.nextDouble();

        // Comprobar que las entradas sean válidas
        if (edad < 0 || tarifaBase < 0 ||
            (!estudiante.equals("S") && !estudiante.equals("N")) ||
            (!horarioPico.equals("S") && !horarioPico.equals("N"))) {
            System.out.println("Datos inválidos");
        } else {

            // Preparar tarifa
            double tarifaFinal = tarifaBase;

            // Incorporar gratuidad por edad
            if (edad < 5 || edad >= 65) {
                tarifaFinal = 0;

            // Incorporar descuento estudiantil del 20 % (regla provisional)
            } else if (estudiante.equals("S") && horarioPico.equals("N")) {
                tarifaFinal = tarifaBase * 0.80;
            }

            // Presentar el resultado calculado
            System.out.println("Tarifa final: $" + tarifaFinal);
        }
        sc.close();
    }
}
