// Ejercicio 16 Suma hasta ingresar cero
import java.util.Scanner;
public class Ejercicio_16_Suma_hasta_ingresar_cero {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        int numero, suma;
        // Preparar la suma en cero
        suma = 0;
        // Solicitar el primer numero
        System.out.println("Ingrese un numero (0 para terminar):");
        numero = sc.nextInt();
        // Continuar mientras el numero sea diferente de cero
        while (numero != 0) {
            // Acumular el numero ingresado
            suma = suma + numero;
            // Solicitar otro numero
            System.out.println("Ingrese otro numero (0 para terminar):");
            numero = sc.nextInt();
        }
        // Presentar la suma total
        System.out.println("La suma total es: " + suma);
    }
}
