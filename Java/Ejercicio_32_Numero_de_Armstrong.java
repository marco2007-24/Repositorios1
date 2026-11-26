// Ejercicio 32 Numero de Armstrong
import java.util.Scanner;
public class Ejercicio_32_Numero_de_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número
        System.out.println("Ingrese un número de tres dígitos:");
        int numero = sc.nextInt();

        // Comprobar número
        if (numero >= 100 && numero <= 999) {
            // Asignar los valores iniciales
            int original = numero;
            int suma = 0;

            // Extraer y elevar los dígitos al cubo
            while (numero > 0) {
                int digito = numero % 10;
                suma = suma + (digito * digito * digito);
                numero = numero / 10;
            }

            // Comprobar número de Armstrong
            if (suma == original) {
                System.out.println("Es un número de Armstrong");
            } else {
                System.out.println("No es un número de Armstrong");
            }
        } else {
            System.out.println("Debe ingresar un número de tres dígitos");
        }

        sc.close();
    }
}
