// Ejercicio 40 Amortizacion de prestamo
import java.util.Scanner;
public class Ejercicio_40_Amortizacion_de_prestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.println("Ingrese el monto del préstamo:");
        double monto = sc.nextDouble();

        System.out.println("Ingrese la tasa de interés mensual (%):");
        double tasa = sc.nextDouble();

        System.out.println("Ingrese el número de meses:");
        int meses = sc.nextInt();

        // Comprobar monto, tasa y plazo
        if (monto > 0 && tasa >= 0 && meses > 0) {
            // Obtener interés simple
            double interes = monto * (tasa / 100) * meses;

            // Obtener cuota mensual
            double cuota = (monto + interes) / meses;

            // Presentar los resultados calculados
            System.out.println("Interés total: $" + interes);
            System.out.println("Cuota mensual: $" + cuota);
        } else {
            System.out.println("Datos inválidos: monto positivo, tasa no negativa y meses mayores que cero");
        }
        sc.close();

    }
}
