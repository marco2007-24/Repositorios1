// Ejercicio 47 Estacion del ano
import java.util.Scanner;
public class Ejercicio_47_Estacion_del_ano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los valores necesarios
        System.out.println("Ingrese el número del mes (1-12):");
        int mes = sc.nextInt();

        System.out.println("Ingrese el día:");
        int dia = sc.nextInt();

        System.out.println("Ingrese el año:");
        int anio = sc.nextInt();

        // Identificar días del mes
        int maxDias = 0;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxDias = 31;
                break;
            case 4, 6, 9, 11:
                maxDias = 30;
                break;
            case 2:
                maxDias = (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) ? 29 : 28;
                break;
        }

        // Comprobar fecha
        if (anio <= 0 || mes < 1 || mes > 12 || dia < 1 || dia > maxDias) {
            System.out.println("Fecha no válida");
        } else {
            // Identificar estación
            switch (mes) {
                case 12, 1, 2:
                    System.out.println("Verano");
                    break;
                case 3, 4, 5:
                    System.out.println("Otoño");
                    break;
                case 6, 7, 8:
                    System.out.println("Invierno");
                    break;
                default:
                    System.out.println("Primavera");
            }
        }
        sc.close();

    }
}
