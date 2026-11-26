// Ejercicio 43 Conversion decimal a binario
import java.util.Scanner;
public class Ejercicio_43_Conversion_decimal_a_binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número
        System.out.println("Ingrese un número entero no negativo:");
        int numero = sc.nextInt();

        // Comprobar número
        if (numero >= 0) {
            String binario = "";

            // Convertir a binario
            if (numero == 0) {
                binario = "0";
            } else {
                while (numero > 0) {
                    int residuo = numero % 2;
                    binario = residuo + binario;
                    numero = numero / 2;
                }
            }

            // Presentar el resultado calculado
            System.out.println("Número binario: " + binario);
        } else {
            System.out.println("El número no puede ser negativo");
        }

    }
}
