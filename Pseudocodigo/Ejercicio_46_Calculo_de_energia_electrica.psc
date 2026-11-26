// Ejercicio 46 Calculo de energia electrica
Algoritmo EnergiaElectrica()
 Inicio
        // Definir los datos utilizados
        Definir potencia, horas, tarifa Como Real
        Definir consumo, costo Como Real
    
        // Leer los valores necesarios
        Escribir "Ingrese la potencia en watts:"
        Leer potencia
        Escribir "Ingrese las horas de uso diario:"
        Leer horas
        Escribir "Ingrese la tarifa por kWh:"
        Leer tarifa
    
        // Obtener consumo mensual
        consumo <- (potencia / 1000) * horas * 30
    
        // Obtener costo mensual
        costo <- consumo * tarifa
    
        // Presentar los resultados calculados
        Escribir "Consumo mensual en kWh: ", consumo
        Escribir "Costo mensual: $", costo
 Fin
