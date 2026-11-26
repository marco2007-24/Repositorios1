// Ejercicio 58 Conversor Monedas
import java.util.Scanner;

public class Ejercicio_58_Conversor_Monedas {
    public static void main(String[] args) {
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);

        // Solicitar los valores de entrada
        System.out.print("Código (1=EUR, 2=GBP, 3=JPY, 4=MXN): ");
        int codigo = sc.nextInt();

        System.out.print("Monto en USD: ");
        double monto = sc.nextDouble();

        // Comprobar que las entradas sean válidas
        if (codigo < 1 || codigo > 4 || monto < 0) {
            System.out.println("Datos inválidos");
        } else {

            // Definir los datos utilizados
            double tasa = 0;
            double comision = 0;
            String moneda = "";

            // Asignar tasa y comisión según la moneda
            switch (codigo) {
                case 1:
                    tasa = 0.92;
                    comision = 0.01;
                    moneda = "EUR";
                    break;

                case 2:
                    tasa = 0.78;
                    comision = 0.01;
                    moneda = "GBP";
                    break;

                case 3:
                    tasa = 149;
                    comision = 0.015;
                    moneda = "JPY";
                    break;

                case 4:
                    tasa = 17.2;
                    comision = 0.02;
                    moneda = "MXN";
                    break;
            }

            // Obtener resultado con comisión
            double comisionUSD = monto * comision;
            double resultado = (monto - comisionUSD) * tasa;

            // Presentar los resultados calculados
            System.out.println("Resultado en " + moneda + ": " + resultado);
            System.out.println("Comisión en USD: $" + comisionUSD);
        }
        sc.close();
    }
}
