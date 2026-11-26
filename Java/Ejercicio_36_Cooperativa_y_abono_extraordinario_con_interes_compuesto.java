// Ejercicio 36 Cooperativa y abono extraordinario con interes compuesto
import java.util.Scanner;
public class Ejercicio_36_Cooperativa_y_abono_extraordinario_con_interes_compuesto {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir variables decimales
        double montoPrestamo, tasaTrimestral, porcentajeAbono;
        double montoTotal, abonoTotal, abonoExtra;
        // Definir variable entera
        int numeroTrimestres;
        // Solicitar los datos
        System.out.println("Ingrese el monto del prestamo:");
        montoPrestamo = sc.nextDouble();
        System.out.println("Ingrese la tasa trimestral:");
        tasaTrimestral = sc.nextDouble();
        System.out.println("Ingrese porcentaje abono:");
        porcentajeAbono = sc.nextDouble();
        System.out.println("Ingrese numero de trimestres:");
        numeroTrimestres = sc.nextInt();
        // Comprobar datos; tasa decimal (0.05 = 5 %)
        if (montoPrestamo <= 0 || tasaTrimestral < 0 || porcentajeAbono < 0 ||
            porcentajeAbono > 100 || numeroTrimestres < 0) {
            System.out.println("Datos inválidos");
        } else {
            // Obtener interés compuesto y abono
            montoTotal = montoPrestamo * Math.pow(1 + tasaTrimestral, numeroTrimestres);
            abonoExtra = montoTotal * porcentajeAbono / 100;
            abonoTotal = montoTotal - abonoExtra;

            // Presentar los resultados calculados
            System.out.println("El monto antes del abono es: " + montoTotal);
            System.out.println("El abono es: " + abonoExtra);
            System.out.println("El monto final es: " + abonoTotal);
        }
        sc.close();
    }
}
