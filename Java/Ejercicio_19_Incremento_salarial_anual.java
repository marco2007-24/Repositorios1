// Ejercicio 19 Incremento salarial anual
public class Ejercicio_19_Incremento_salarial_anual {
    public static void main(String[] args) {
        // Definir los datos utilizados
        double salario;
        int anio;
        // Asignar los valores iniciales
        salario = 1500;
        anio = 1;
        // Continuar durante 6 años
        while (anio <= 6) {
            // Incrementar el salario un 10%
            salario = salario * 1.10;
            // Presentar el salario de cada año
            System.out.println("Salario del año " + anio + ": $" + salario);
            // Incrementar el contador
            anio = anio + 1;
        }
        // Presentar el salario final
        System.out.println("Salario final: $" + salario);
    }
}
