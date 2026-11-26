// Ejercicio 57 Nivel Academico
import java.util.Scanner;
public class Ejercicio_57_Nivel_Academico {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Solicitar los valores de entrada
        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();
        System.out.print("Materias reprobadas: ");
        int repro = sc.nextInt();
        // Comprobar que las entradas sean válidas
        if (promedio < 0 || promedio > 10 || repro < 0) {
            System.out.println("Datos inválidos");
        } else {
            // Clasificar el nivel académico
            int nivel = 4;

            if (promedio >= 9 && repro == 0) {
                nivel = 1;
            } else if (promedio >= 8 && repro <= 1) {
                nivel = 2;
            } else if (promedio >= 7) {
                nivel = 3;
            }
            // Presentar resultado según el nivel
            switch (nivel) {
                case 1:
                    System.out.println("Excelente - Continúa así");
                    break;
                case 2:
                    System.out.println("Bueno - Refuerza debilidades");
                    break;
                case 3:
                    System.out.println("Regular - Necesitas más estudio");
                    break;
                case 4:
                    System.out.println("En riesgo - Busca tutoría");
                    break;
            }
        }
    }
}
