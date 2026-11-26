// Ejercicio 61 Descuento Comercial
import java.util.Scanner; 
public class Ejercicio_61_Descuento_Comercial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar los valores de entrada
        System.out.print("Categoría (1=Elec, 2=Ropa, 3=Alim): ");
        int categoria = sc.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
        System.out.print("¿Tiene membresía? (S/N): ");
        String membresia = sc.next().toUpperCase();
        // Comprobar que las entradas sean válidas
        if (categoria < 1 || categoria > 3 || cantidad <= 0 || precio < 0) {
            System.out.println("Datos inválidos");
        } else {
            // Obtener subtotal
            double subtotal = cantidad * precio;
            double descuento = 0;
            // Descuento según categoría
            switch (categoria) {
                case 1:
                    if (cantidad >= 5) {
                        descuento = subtotal * 0.08;
                    }
                    break;
                case 2:
                    if (cantidad >= 3) {
                        descuento = subtotal * 0.12;
                    }
                    break;
                case 3:
                    descuento = subtotal * 0.05;
                    break;
            }
            // Descuento por membresía
            if (membresia.equals("S")) {
                descuento += subtotal * 0.05;
            }
            double total = subtotal - descuento;
            // Descuento extra por monto
            if (total > 100) {
                descuento += total * 0.03;
                total = subtotal - descuento;
            }
            // Presentar los resultados calculados
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);
        }
    }
}
