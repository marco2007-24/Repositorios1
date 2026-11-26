// Ejercicio 31 Suma de serie armonica
Algoritmo serieArmonica()
 Inicio
        // Definir los datos utilizados
        Definir N, i Como Entero
        Definir suma Como Real
    
        // Leer los valores necesarios
        Escribir "Ingrese el valor de N:"
        Leer N
    
        // Comprobar número
        Si N > 0 Entonces
            // Asignar los valores iniciales
            suma <- 0
            i <- 1
    
            // Obtener suma de la serie
            Mientras i <= N Hacer
                suma <- suma + (1 / i)
                i <- i + 1
            FinMientras
    
            // Presentar el resultado calculado
            Escribir "La suma de la serie es: ", suma
        SiNo
            Escribir "N debe ser mayor que cero"
        FinSi
 Fin
