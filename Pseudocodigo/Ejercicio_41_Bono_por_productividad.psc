// Ejercicio 41 Bono por productividad
Algoritmo BonoProductividad()
 Inicio
        // Definir los datos utilizados
        Definir sueldo, productividad Como Real
        Definir porcentaje, bono, total Como Real
    
        // Leer los valores necesarios
        Escribir "Ingrese el sueldo base:"
        Leer sueldo
        Escribir "Ingrese el porcentaje de productividad:"
        Leer productividad
    
        // Identificar porcentaje de bono
        Si productividad >= 90 Entonces
            porcentaje <- 0.20
        SiNo
            Si productividad >= 70 Entonces
                porcentaje <- 0.10
            SiNo
                Si productividad >= 50 Entonces
                    porcentaje <- 0.05
                SiNo
                    porcentaje <- 0
                FinSi
            FinSi
        FinSi
    
        // Obtener bono y sueldo total
        bono <- sueldo * porcentaje
        total <- sueldo + bono
    
        // Presentar los resultados calculados
        Escribir "Bono recibido: $", bono
        Escribir "Total a pagar: $", total
Fin
