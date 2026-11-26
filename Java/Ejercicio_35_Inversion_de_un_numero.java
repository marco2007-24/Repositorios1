// Ejercicio 35 Inversion de un numero
import java.util.Scanner;
public class Ejercicio_35_Inversion_de_un_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número
        System.out.println("Ingrese un número entero positivo:");
        int numero = sc.nextInt();

        // Comprobar número
        if (numero > 0) {
            // Asignar los valores iniciales
            int original = numero;
            int invertido = 0;

            // Invertir los dígitos
            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }

            // Presentar los resultados calculados
            System.out.println("Número original: " + original);
            System.out.println("Número invertido: " + invertido);
        } else {
            System.out.println("Debe ingresar un número positivo");
        }

    }
}
