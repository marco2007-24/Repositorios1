// Ejercicio 53 Tarifas de taxi
Algoritmo TarifaTaxi()
 Inicio
        // Definir los datos utilizados
        Definir km, tarifa Como Real
        Definir noche Como Cadena
    
        // Leer los valores necesarios
        Escribir "Ingrese los kilómetros recorridos:"
        Leer km
        Escribir "¿Es de noche? (S/N):"
        Leer noche
    
        // Comprobar distancia
        Si km >= 0 Entonces
            // Obtener tarifa base
            tarifa <- 2 + (1.50 * km)
    
            // Incorporar recargo por distancia
            Si km > 10 Entonces
                tarifa <- tarifa * 1.20
            FinSi
    
            // Incorporar recargo nocturno
            Si Mayusculas(noche) = "S" Entonces
                tarifa <- tarifa * 1.30
            FinSi

            // Presentar el resultado calculado
            Escribir "Total a pagar: $", tarifa
        SiNo
            Escribir "Los kilómetros no pueden ser negativos"
        FinSi
 Fin
