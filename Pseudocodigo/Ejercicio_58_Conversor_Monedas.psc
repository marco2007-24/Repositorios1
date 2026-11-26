// Ejercicio 58 Conversor Monedas
Algoritmo ConversorMonedas()
 Inicio
        // Definir los datos utilizados
        Definir codigo Como Entero
        Definir monto, tasa, comision, comisionUSD, resultado Como Real
        Definir moneda Como Cadena
        // Solicitar los valores de entrada
        Escribir "Código (1=EUR, 2=GBP, 3=JPY, 4=MXN): "
        Leer codigo
        Escribir "Monto en USD: "
        Leer monto
        // Comprobar que las entradas sean válidas
        Si codigo < 1 O codigo > 4 O monto < 0 Entonces
            Escribir "Datos inválidos"
        SiNo
            // Asignar tasa y comisión según la moneda
            Segun codigo Hacer
                1:
                    tasa <- 0.92
                    comision <- 0.01
                    moneda <- "EUR"
                2:
                    tasa <- 0.78
                    comision <- 0.01
                    moneda <- "GBP"
                3:
                    tasa <- 149
                    comision <- 0.015
                    moneda <- "JPY"
                4:
                    tasa <- 17.2
                    comision <- 0.02
                    moneda <- "MXN"
            FinSegun
            // Obtener resultado con comisión
            comisionUSD <- monto * comision
            resultado <- (monto - comisionUSD) * tasa
            // Presentar los resultados calculados
            Escribir "Resultado en ", moneda, ": ", resultado
            Escribir "Comisión en USD: $", comisionUSD
        FinSi
 Fin
