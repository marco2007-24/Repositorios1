// Ejercicio 01 Dia de la semana

import java.util.Scanner;

public class Ejercicio_01_Dia_de_la_semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar número
        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = sc.nextInt();
        // Identificar día de la semana
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
