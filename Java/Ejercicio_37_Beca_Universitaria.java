// Ejercicio 37 Beca Universitaria
import java.util.Scanner;
public class Ejercicio_37_Beca_Universitaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.println("Ingrese el promedio (0 a 10):");
        double promedio = sc.nextDouble();

        System.out.println("Ingrese el número de materias reprobadas:");
        int reprobadas = sc.nextInt();

        System.out.println("¿Es estudiante de primer ciclo? (S/N):");
        String primerCiclo = sc.next().toUpperCase();

        // Comprobar que las entradas sean válidas
        if (promedio >= 0 && promedio <= 10 && reprobadas >= 0) {
            int beca;

            // Identificar porcentaje de beca
            if (promedio >= 9 && reprobadas == 0 &&
                primerCiclo.equals("S")) {
                beca = 100;
            } else if (promedio >= 8 && reprobadas <= 1) {
                beca = 70;
            } else if (promedio >= 7 && reprobadas <= 2) {
                beca = 40;
            } else {
                beca = 0;
            }

            // Presentar los resultados calculados
            if (beca > 0) {
                System.out.println("Beca aprobada");
                System.out.println("Porcentaje de beca: " + beca + "%");
            } else {
                System.out.println("Beca rechazada");
            }
        } else {
            System.out.println("Datos fuera del rango permitido");
        }

    }
}
