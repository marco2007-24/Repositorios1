// Ejercicio 33 Ahorro con aportes variables
Algoritmo simulacionAhorro()
 Inicio
        // Definir los datos utilizados
        Definir N, mes Como Entero
        Definir aporte, saldo Como Real
    
        // Solicitar cantidad de meses
        Escribir "Ingrese la cantidad de meses:"
        Leer N
    
        // Comprobar meses
        Si N > 0 Entonces
            // Asignar los valores iniciales
            saldo <- 0
            mes <- 1
    
            // Obtener ahorro mensual
            Mientras mes <= N Hacer
                Escribir "Ingrese el aporte del mes ", mes, ":"
                Leer aporte
    
                // Acumular aporte y aplicar interés
                saldo <- saldo + aporte
                saldo <- saldo * 1.008
    
                mes <- mes + 1
            FinMientras
    
            // Presentar el resultado calculado
            Escribir "El saldo final es: $", saldo
        SiNo
            Escribir "La cantidad de meses debe ser mayor que cero"
        FinSi
Fin
