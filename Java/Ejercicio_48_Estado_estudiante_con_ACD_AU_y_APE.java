// Ejercicio 48 Estado estudiante con ACD AU y APE
import java.util.Scanner;
public class Ejercicio_48_Estado_estudiante_con_ACD_AU_y_APE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y validar nota ACD
        System.out.println("Ingrese nota ACD:");
        double ACD = sc.nextDouble();

        while (ACD < 0 || ACD > 10) {
            System.out.println("Nota incorrecta, ingrese nuevamente:");
            ACD = sc.nextDouble();
        }

        // Solicitar y validar nota AU
        System.out.println("Ingrese nota AU:");
        double AU = sc.nextDouble();

        while (AU < 0 || AU > 10) {
            System.out.println("Nota incorrecta, ingrese nuevamente:");
            AU = sc.nextDouble();
        }

        // Solicitar y validar nota APE
        System.out.println("Ingrese nota APE:");
        double APE = sc.nextDouble();

        while (APE < 0 || APE > 10) {
            System.out.println("Nota incorrecta, ingrese nuevamente:");
            APE = sc.nextDouble();
        }

        // Obtener promedio ponderado
        double promedio = ACD * 0.30 + AU * 0.30 + APE * 0.40;

        // Presentar el resultado calculado
        System.out.println("Promedio final: " + promedio);

        // Identificar aprobación
        if (promedio >= 7) {
            System.out.println("Estudiante aprobado");
        } else {
            System.out.println("Estudiante reprobado");
        }

    }
}
