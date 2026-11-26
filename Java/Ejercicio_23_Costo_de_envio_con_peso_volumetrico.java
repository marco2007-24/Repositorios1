// Ejercicio 23 Costo de envio con peso volumetrico
import java.util.Scanner;
public class Ejercicio_23_Costo_de_envio_con_peso_volumetrico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definir tarifa
        double tarifa = 2.50;

        // Leer los valores necesarios
        System.out.print("Ingrese peso real en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese largo en cm: ");
        double largo = sc.nextDouble();

        System.out.print("Ingrese ancho en cm: ");
        double ancho = sc.nextDouble();

        System.out.print("Ingrese alto en cm: ");
        double alto = sc.nextDouble();

        // Obtener peso volumétrico
        double pesoVolumetrico = (largo * ancho * alto) / 5000;

        // Identificar peso a cobrar
        double pesoCobrar;

        if (peso > pesoVolumetrico) {
            pesoCobrar = peso;
        } else {
            pesoCobrar = pesoVolumetrico;
        }

        // Obtener costo total
        double totalPagar = pesoCobrar * tarifa;

        // Presentar los resultados calculados
        System.out.println("El peso a cobrar es: " + pesoCobrar + " kg");
        System.out.println("El total a pagar es: $" + totalPagar);

    }
}
