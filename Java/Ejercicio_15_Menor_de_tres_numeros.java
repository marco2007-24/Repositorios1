// Ejercicio 15 Menor de tres numeros

import java.util.Scanner;
public class Ejercicio_15_Menor_de_tres_numeros {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        double num1, num2, num3, menor;
        // Solicitar el primer numero
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextDouble();
        // Solicitar el segundo numero
        System.out.println("Ingrese el segundo numero:");
        num2 = sc.nextDouble();
        // Solicitar el tercer numero
        System.out.println("Ingrese el tercer numero:");
        num3 = sc.nextDouble();
        // Comprobar si el primer numero es el menor
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        }
        // Si no, verificar si el segundo numero es el menor
        else {
            if (num2 <= num1 && num2 <= num3) {
                menor = num2;
            }
            // Si no, el tercer numero es el menor
            else {
                menor = num3;
            }
        }
        // Presentar el numero menor
        System.out.println("El menor de los tres numeros es: " + menor);
    }
}
