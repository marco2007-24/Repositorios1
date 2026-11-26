// Ejercicio 14 Numero par o impar
import java.util.Scanner;
public class Ejercicio_14_Numero_par_o_impar {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        int numero;
        // Solicitar un numero entero
        System.out.println("Ingrese un numero entero:");
        numero = sc.nextInt();
        // Comprobar si el numero es par
        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        }
        // Si no es par, el numero es impar
        else {
            System.out.println("El numero es IMPAR");
        }
    }
}
