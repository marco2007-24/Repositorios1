// Ejercicio 11 Sueldo y horas extra
import java.util.Scanner;
public class Ejercicio_11_Sueldo_y_horas_extra {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        double horas, pagoHora, sueldo = 0;
        // Solicitar las horas trabajadas
        System.out.println("Ingrese horas trabajadas:");
        horas = sc.nextDouble();
        // Solicitar el pago por hora
        System.out.println("Ingrese pago por horas:");
        pagoHora = sc.nextDouble();
        // Obtener sueldo si trabaja 40 horas o menos
        if (horas <= 40) {
            sueldo = horas * pagoHora;
        }
        // Obtener sueldo si trabaja mas de 40 horas
        if (horas > 40) {
            sueldo = (40 * pagoHora) + ((horas - 40) * pagoHora * 2);
        }
        // Presentar el sueldo semanal
        System.out.println("El sueldo semanal es: " + sueldo);
    }
}
