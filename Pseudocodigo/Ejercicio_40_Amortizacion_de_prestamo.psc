// Ejercicio 40 Amortizacion de prestamo
Algoritmo AmortizacionPrestamo()
  Inicio
        // Definir los datos utilizados
        Definir monto, tasa, interes, cuota Como Real
        Definir meses Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese el monto del préstamo:"
        Leer monto
        Escribir "Ingrese la tasa de interés mensual (%):"
        Leer tasa
        Escribir "Ingrese el número de meses:"
        Leer meses
    
        // Comprobar monto, tasa y plazo
        Si monto > 0 Y tasa >= 0 Y meses > 0 Entonces
            // Obtener interés simple
            interes <- monto * (tasa / 100) * meses
    
            // Obtener cuota mensual
            cuota <- (monto + interes) / meses
    
            // Presentar los resultados calculados
            Escribir "Interés total: $", interes
            Escribir "Cuota mensual: $", cuota
        SiNo
            Escribir "Datos inválidos: monto positivo, tasa no negativa y meses mayores que cero"
        FinSi
 Fin
