// Ejercicio 09 Dolares a pesos mexicanos
import java.util.Scanner;
public class Ejercicio_09_Dolares_a_pesos_mexicanos {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        double dolares, cambioMoneda, cambioFinal;
        // Definir el tipo de cambio
        cambioMoneda = 18.43;
        // Solicitar la cantidad de dolares
        System.out.println("Ingrese cantidad de dolares:");
        dolares = sc.nextDouble();
        // Obtener la conversion de dolares a pesos
        cambioFinal = dolares * cambioMoneda;
        // Presentar el resultado obtenido
        System.out.println("El cambio final es: " + cambioFinal);
    }
}
