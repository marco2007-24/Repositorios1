// Ejercicio 10 Area y perimetro de un rectangulo
import java.util.Scanner;
public class Ejercicio_10_Area_y_perimetro_de_un_rectangulo {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        double largo, ancho, area, perimetro;
        // Solicitar el largo del terreno
        System.out.println("Ingrese largo del terreno:");
        largo = sc.nextDouble();
        // Solicitar el ancho del terreno
        System.out.println("Ingrese ancho del terreno:");
        ancho = sc.nextDouble();
        // Obtener el area del terreno
        area = largo * ancho;
        // Obtener el perimetro del terreno
        perimetro = 2 * (largo + ancho);
        // Presentar los resultados obtenidos
        System.out.println("El area del terreno es: " + area);
        System.out.println("El perimetro del terreno es: " + perimetro);
    }
}
