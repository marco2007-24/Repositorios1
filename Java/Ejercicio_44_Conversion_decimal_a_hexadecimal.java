// Ejercicio 44 Conversion decimal a hexadecimal
import java.util.Scanner;
public class Ejercicio_44_Conversion_decimal_a_hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número
        System.out.println("Ingrese un número entero no negativo:");
        int numero = sc.nextInt();

        // Comprobar número
        if (numero >= 0) {
            String hexadecimal = "";

            // Convertir a hexadecimal
            if (numero == 0) {
                hexadecimal = "0";
            } else {
                while (numero > 0) {
                    int residuo = numero % 16;
                    String digito;

                    // Identificar dígito hexadecimal
                    switch (residuo) {
                        case 10:
                            digito = "A";
                            break;
                        case 11:
                            digito = "B";
                            break;
                        case 12:
                            digito = "C";
                            break;
                        case 13:
                            digito = "D";
                            break;
                        case 14:
                            digito = "E";
                            break;
                        case 15:
                            digito = "F";
                            break;
                        default:
                            digito = Integer.toString(residuo);
                    }

                    // Construir número hexadecimal
                    hexadecimal = digito + hexadecimal;
                    numero = numero / 16;
                }
            }

            // Presentar el resultado calculado
            System.out.println("Número hexadecimal: " + hexadecimal);
        } else {
            System.out.println("El número no puede ser negativo");
        }

        sc.close();
    }
}
