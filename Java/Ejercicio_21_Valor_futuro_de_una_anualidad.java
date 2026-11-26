// Ejercicio 21 Valor futuro de una anualidad
import java.util.Scanner;
public class Ejercicio_21_Valor_futuro_de_una_anualidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los valores necesarios
        System.out.print("Ingrese depósito mensual: ");
        double depositoMensual = sc.nextDouble();

        System.out.print("Ingrese tasa mensual: ");
        double tasaMensual = sc.nextDouble();

        System.out.print("Ingrese número de meses: ");
        int meses = sc.nextInt();

        if (depositoMensual < 0 || tasaMensual < 0 || meses <= 0) {
            System.out.println("Datos inválidos");
        } else {
            // Obtener total depositado
            double totalDepositado = depositoMensual * meses;

        // Obtener valor futuro
            double valorFuturo;

            if (tasaMensual == 0) {
                valorFuturo = totalDepositado;
            } else {
                valorFuturo = depositoMensual *
                    ((Math.pow(1 + tasaMensual, meses) - 1) / tasaMensual);
            }

        // Presentar los resultados calculados
            System.out.println("El valor total depositado es: " + totalDepositado);
            System.out.println("El valor futuro es: " + valorFuturo);
        }
        sc.close();

    }
}
