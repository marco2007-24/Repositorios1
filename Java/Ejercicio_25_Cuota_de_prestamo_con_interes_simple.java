// Ejercicio 25 Cuota de prestamo con interes simple

import java.util.Scanner;
public class Ejercicio_25_Cuota_de_prestamo_con_interes_simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.print("Ingrese el capital: ");
        double capital = sc.nextDouble();

        System.out.print("Ingrese la tasa anual en porcentaje (12 para 12%): ");
        double tasaAnual = sc.nextDouble();

        System.out.print("Ingrese los meses: ");
        int meses = sc.nextInt();

        // Comprobar plazo
        if (meses > 0) {
            // Obtener interés simple
            double porcentaje = tasaAnual / 100;
            double interes = capital * porcentaje * (meses / 12.0);

            // Obtener cuota mensual
            double cuotaMensual = (capital + interes) / meses;

            // Presentar los resultados calculados
            System.out.println("El interés es: " + interes);
            System.out.println("La cuota mensual es: " + cuotaMensual);
        } else {
            System.out.println("El número de meses debe ser mayor que cero");
        }

    }
}
