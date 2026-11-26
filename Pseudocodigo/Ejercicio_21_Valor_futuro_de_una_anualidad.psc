// Ejercicio 21 Valor futuro de una anualidad
Algoritmo valorFuturo()
  Inicio
        // Definir los datos utilizados
        Definir depositoMensual, tasaMensual, valorFuturo, totalDepositado Como Real
        Definir meses Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese depósito mensual"
        Leer depositoMensual
        Escribir "Ingrese tasa mensual"
        Leer tasaMensual
        Escribir "Ingrese número de meses"
        Leer meses
    
        // Comprobar datos (la tasa se ingresa en decimal, por ejemplo 0.02)
        Si depositoMensual < 0 O tasaMensual < 0 O meses <= 0 Entonces
            Escribir "Datos inválidos"
        SiNo
            // Obtener total depositado
            totalDepositado <- depositoMensual * meses
    
        // Obtener valor futuro
            Si tasaMensual = 0 Entonces
                valorFuturo <- totalDepositado
            SiNo
                valorFuturo <- depositoMensual * (((1 + tasaMensual)^meses - 1) / tasaMensual)
            FinSi
    
        // Presentar los resultados calculados
            Escribir "El valor total depositado es: ", totalDepositado
            Escribir "El valor futuro es: ", valorFuturo
        FinSi
 Fin
