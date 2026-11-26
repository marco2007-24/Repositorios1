// Ejercicio 12 Aprobado o reprobado
import java.util.Scanner;
public class Ejercicio_12_Aprobado_o_reprobado {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        double promedio;
        // Solicitar el promedio del estudiante
        System.out.println("Ingrese el promedio:");
        promedio = sc.nextDouble();
        // Comprobar si el estudiante esta aprobado
        if (promedio >= 7) {
            System.out.println("Estudiante aprobado");
        }
        // Si el promedio es menor a 7, esta reprobado
        else {
            System.out.println("Estudiante reprobado");
        }
    }
}
