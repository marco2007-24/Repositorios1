// Ejercicio 27 Tarifa de estacionamiento nocturno
Algoritmo tarifaEstacionamiento()
 Inicio
        // Definir los datos utilizados
        Definir horas, tarifa, total Como Real
        Definir nocturno Como Cadena
    
        // Leer los valores necesarios
        Escribir "Ingrese las horas de estacionamiento:"
        Leer horas
        Escribir "¿Es horario nocturno? (S/N):"
        Leer nocturno
    
        // Comprobar horas
        Si horas > 0 Entonces
            // Obtener tarifa base
            tarifa <- horas * 1.50
    
            // Incorporar recargo por tiempo
            Si horas > 8 Entonces
                tarifa <- tarifa * 1.25
            FinSi
    
            // Incorporar recargo nocturno
            Si nocturno = "S" Entonces
                tarifa <- tarifa * 1.30
            FinSi
    
            // Presentar el resultado calculado
            total <- tarifa
            Escribir "Total a pagar: $", total
        SiNo
            Escribir "Las horas deben ser mayores que cero"
        FinSi
 Fin
