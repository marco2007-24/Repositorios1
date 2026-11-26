// Ejercicio 59 Plan Materias
import java.util.Scanner;
public class Ejercicio_59_Plan_Materias {
    public static void main(String[] args) {
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Solicitar los valores de entrada
        System.out.print("Semestre actual (1-4): ");
        int semestre = sc.nextInt();
        System.out.print("Promedio actual: ");
        double promedio = sc.nextDouble();
        // Comprobar que las entradas sean válidas
        if (semestre < 1 || semestre > 4 || promedio < 0 || promedio > 10) {
            System.out.println("Datos inválidos");
        } else {
            // Preparar materias
            int materias = 0;
            // Asignar materias según el semestre
            switch (semestre) {
                case 1:
                case 2:
                    materias = 5;
                    break;
                case 3:
                case 4:
                    materias = 4;
                    break;
            }
            // Ajustar materias según el promedio
            if (promedio >= 8.5) {
                materias++;
            } else if (promedio < 7) {
                materias--;
            }
            // Establecer mínimo y máximo de materias
            if (materias < 3) {
                materias = 3;
            }
            if (materias > 6) {
                materias = 6;
            }
            // Presentar el resultado calculado
            System.out.println("Materias recomendadas: " + materias);
        }
    }
}
