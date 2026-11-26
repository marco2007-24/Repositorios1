// Ejercicio 07 Gasto semanal de transporte
import java.util.Scanner;
public class Ejercicio_07_Gasto_semanal_de_transporte {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        int viajesDia, diasSemana;
        double pasaje, gastoTotal;
        // Solicitar la cantidad de viajes por dia
        System.out.println("Ingrese viajes por dia:");
        viajesDia = sc.nextInt();
        // Solicitar los dias que viaja
        System.out.println("Ingrese cuantos dias viaja:");
        diasSemana = sc.nextInt();
        // Solicitar el costo del pasaje
        System.out.println("Ingrese costo del pasaje:");
        pasaje = sc.nextDouble();
        // Obtener el gasto total de transporte
        gastoTotal = viajesDia * diasSemana * pasaje;
        // Presentar el resultado obtenido
        System.out.println("El gasto total es: " + gastoTotal);
    }
}
