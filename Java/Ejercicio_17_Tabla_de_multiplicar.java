// Ejercicio 17 Tabla de multiplicar
import java.util.Scanner;
public class Ejercicio_17_Tabla_de_multiplicar {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        int K, i, resultado;
        // Solicitar un numero entero
        System.out.println("Ingrese un numero entero:");
        K = sc.nextInt();
        // Preparar el contador
        i = 1;
        // Continuar mientras i sea menor o igual a 10
        while (i <= 10) {
            // Obtener la multiplicacion
            resultado = K * i;
            // Presentar el resultado obtenido
            System.out.println(K + " x " + i + " = " + resultado);
            // Incrementar el contador
            i = i + 1;
        }
    }
}
