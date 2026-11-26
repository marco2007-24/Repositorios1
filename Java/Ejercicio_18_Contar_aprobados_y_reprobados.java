// Ejercicio 18 Contar aprobados y reprobados
import java.util.Scanner;
public class Ejercicio_18_Contar_aprobados_y_reprobados {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        int N, i, aprobados, reprobados;
        double nota;
        // Preparar contadores
        aprobados = 0;
        reprobados = 0;
        i = 1;
        // Solicitar cantidad de estudiantes
        System.out.println("Ingrese la cantidad de estudiantes:");
        N = sc.nextInt();
        // Continuar mientras i sea menor o igual a N
        while (i <= N) {
            // Solicitar nota del estudiante
            System.out.println("Ingrese la nota del estudiante " + i + ":");
            nota = sc.nextDouble();
            // Comprobar si el estudiante aprobo
            if (nota >= 7) {
                aprobados = aprobados + 1;
            }
            // Si no aprobo, contar como reprobado
            else {
                reprobados = reprobados + 1;
            }
            // Incrementar el contador
            i = i + 1;
        }
        // Presentar los resultados obtenidos
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
    }
}
