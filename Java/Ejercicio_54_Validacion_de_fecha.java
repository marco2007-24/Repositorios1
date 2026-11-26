// Ejercicio 54 Validacion de fecha
import java.util.Scanner;
public class Ejercicio_54_Validacion_de_fecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar fecha
        System.out.println("Ingrese el día:");
        int dia = sc.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();

        System.out.println("Ingrese el año:");
        int anio = sc.nextInt();

        // Identificar año bisiesto
        boolean bisiesto = false;

        if (anio % 400 == 0) {
            bisiesto = true;
        } else if (anio % 4 == 0 && anio % 100 != 0) {
            bisiesto = true;
        }

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
                if (bisiesto) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
                break;
        }

        // Comprobar fecha
        if (anio > 0 && mes >= 1 && mes <= 12 &&
            dia >= 1 && dia <= maxDias) {
            System.out.println("La fecha es válida");
        } else {
            System.out.println("La fecha no es válida");
        }

    }
}
