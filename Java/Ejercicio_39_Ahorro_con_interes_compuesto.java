// Ejercicio 39 Ahorro con interes compuesto
import java.util.Scanner;
public class Ejercicio_39_Ahorro_con_interes_compuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.println("Ingrese el capital inicial:");
        double capital = sc.nextDouble();

        System.out.println("Ingrese el depósito mensual:");
        double deposito = sc.nextDouble();

        System.out.println("Ingrese la cantidad de meses:");
        int N = sc.nextInt();

        System.out.println("Ingrese la tasa mensual en porcentaje:");
        double tasa = sc.nextDouble();

        // Preparar saldo
        double saldo = capital;

        // Obtener ahorro mensual
        for (int mes = 1; mes <= N; mes++) {
            saldo = (saldo + deposito) * (1 + tasa / 100);
            System.out.println("Saldo del mes " + mes + ": $" + saldo);
        }

        // Presentar el resultado calculado
        System.out.println("Saldo final: $" + saldo);

    }
}
