// Ejercicio 25 Cuota de prestamo con interes simple
Algoritmo interesSimple()
 Inicio
        // Definir los datos utilizados
        Definir capital, interes, cuotaMensual, tasaAnual, porcentaje Como Real
        Definir meses Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese el capital:"
        Leer capital
        Escribir "Ingrese la tasa anual en porcentaje (12 para 12%):"
        Leer tasaAnual
        Escribir "Ingrese los meses:"
        Leer meses
    
        // Comprobar plazo
        Si meses > 0 Entonces
            // Obtener interés simple
            porcentaje <- tasaAnual / 100
            interes <- capital * porcentaje * (meses / 12)
    
            // Obtener cuota mensual
            cuotaMensual <- (capital + interes) / meses
    
            // Presentar los resultados calculados
            Escribir "El interés es: ", interes
            Escribir "La cuota mensual es: ", cuotaMensual
        SiNo
            Escribir "El número de meses debe ser mayor que cero"
        FinSi
 Fin
