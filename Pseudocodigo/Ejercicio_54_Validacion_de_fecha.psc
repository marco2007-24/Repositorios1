// Ejercicio 54 Validacion de fecha
Algoritmo ValidarFecha()
 Inicio
        // Definir los datos utilizados
        Definir dia, mes, anio, maxDias Como Entero
        Definir bisiesto Como Logico
    
        // Solicitar fecha
        Escribir "Ingrese el día:"
        Leer dia
        Escribir "Ingrese el mes:"
        Leer mes
        Escribir "Ingrese el año:"
        Leer anio
    
        // Identificar año bisiesto
        bisiesto <- Falso
        maxDias <- 0
    
        Si anio MOD 400 = 0 Entonces
            bisiesto <- Verdadero
        SiNo
            Si anio MOD 4 = 0 Y anio MOD 100 <> 0 Entonces
                bisiesto <- Verdadero
            FinSi
        FinSi

        // Identificar días del mes
        Si mes >= 1 Y mes <= 12 Entonces
            Segun mes Hacer
                1, 3, 5, 7, 8, 10, 12:
                    maxDias <- 31
                4, 6, 9, 11:
                    maxDias <- 30
                2:
                    Si bisiesto Entonces
                        maxDias <- 29
                    SiNo
                        maxDias <- 28
                    FinSi
            FinSegun
        FinSi
    
        // Comprobar fecha
        Si anio > 0 Y mes >= 1 Y mes <= 12 Y dia >= 1 Y dia <= maxDias Entonces
            Escribir "La fecha es válida"
        SiNo
            Escribir "La fecha no es válida"
        FinSi
 Fin
