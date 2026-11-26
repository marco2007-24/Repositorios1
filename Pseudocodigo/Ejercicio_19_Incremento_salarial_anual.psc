// Ejercicio 19 Incremento salarial anual
Algoritmo IncrementoSalarial()
  Inicio
        // Definir los datos utilizados
        Definir salario Como Real
        Definir año Como Entero
        // Asignar los valores iniciales
        salario <- 1500
        año <- 1
        // Continuar durante 6 años
        Mientras año <= 6 Hacer
            // Incrementar el salario un 10%
            salario <- salario * 1.10
            // Presentar el salario de cada año
            Escribir "Salario del año ", año, ": $", salario
            // Incrementar el contador
            año <- año + 1
        FinMientras
        // Presentar el salario final
        Escribir "Salario final: $", salario
 Fin
