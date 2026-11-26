// Ejercicio 36 Cooperativa y abono extraordinario con interes compuesto
Algoritmo cooperativa()
 Inicio
        // Definir los datos utilizados
        Definir montoPrestamo, tasaTrimestral, porcentajeAbono Como Real
        Definir montoTotal, abonoTotal, abonoExtra Como Real
        Definir numeroTrimestres Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese el monto del préstamo:"
        Leer montoPrestamo
        Escribir "Ingrese la tasa trimestral en decimal:"
        Leer tasaTrimestral
        Escribir "Ingrese porcentaje de abono:"
        Leer porcentajeAbono
        Escribir "Ingrese número de trimestres:"
        Leer numeroTrimestres
    
        // Comprobar datos; la tasa es decimal (0.05 = 5 %)
        Si montoPrestamo <= 0 O tasaTrimestral < 0 O porcentajeAbono < 0 O porcentajeAbono > 100 O numeroTrimestres < 0 Entonces
            Escribir "Datos inválidos"
        SiNo
            // Obtener monto con interés compuesto
            montoTotal <- montoPrestamo * (1 + tasaTrimestral)^numeroTrimestres
    
        // Obtener abono extraordinario
            abonoExtra <- montoTotal * porcentajeAbono / 100
    
        // Obtener monto final
            abonoTotal <- montoTotal - abonoExtra
    
        // Presentar los resultados calculados
            Escribir "El monto antes del abono es: ", montoTotal
            Escribir "El abono es: ", abonoExtra
            Escribir "El monto final es: ", abonoTotal
        FinSi
 Fin
