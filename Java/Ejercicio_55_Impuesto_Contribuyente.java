// Ejercicio 55 Impuesto Contribuyente
import java.util.Scanner;
public class Ejercicio_55_Impuesto_Contribuyente {
    public static void main(String[] args) {

        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);

        // Solicitar los valores de entrada
        System.out.print("Tipo (1=Est, 2=Ind, 3=Emp, 4=Empresa): ");
        int tipo = sc.nextInt();

        System.out.print("Ingreso anual: ");
        double ingreso = sc.nextDouble();

        // Preparar impuesto
        double impuesto = 0.0;

        // Comprobar ingreso
        if (ingreso < 0) {
            System.out.println("El ingreso no puede ser negativo");
        } else {

            // Obtener impuesto según el tipo de contribuyente
            switch (tipo) {
                case 1:
                    if (ingreso >= 5000) {
                        impuesto = ingreso * 0.05;
                    }
                    break;

                case 2:
                    impuesto = ingreso * 0.10;
                    break;

                case 3:
                    impuesto = ingreso * 0.12;
                    if (ingreso > 20000) {
                        impuesto += ingreso * 0.02;
                    }
                    break;

                case 4:
                    impuesto = ingreso * 0.15;
                    break;

                default:
                    System.out.println("Tipo inválido");
            }

            // Presentar el resultado calculado
            if (tipo >= 1 && tipo <= 4) {
                System.out.println("Impuesto a pagar: $" + impuesto);
            }
        }

    }
}
