// Ejercicio 39 Ahorro con interes compuesto
Algoritmo AhorroInteresCompuesto()
 Inicio
        // Definir los datos utilizados
        Definir capital, deposito, tasa, saldo Como Real
        Definir N, mes Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese el capital inicial:"
        Leer capital
        Escribir "Ingrese el depósito mensual:"
        Leer deposito
        Escribir "Ingrese la cantidad de meses:"
        Leer N
        Escribir "Ingrese la tasa mensual en porcentaje:"
        Leer tasa
    
        // Preparar saldo
        saldo <- capital
    
        // Obtener ahorro mensual
        Para mes <- 1 Hasta N Hacer
            saldo <- (saldo + deposito) * (1 + tasa / 100)
            Escribir "Saldo del mes ", mes, ": $", saldo
        FinPara
    
        // Presentar el resultado calculado
        Escribir "Saldo final: $", saldo
 Fin
