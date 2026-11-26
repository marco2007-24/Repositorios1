// Ejercicio 47 Estacion del ano
Algoritmo EstacionAnio()
 Inicio
        // Definir los datos utilizados
        Definir mes, dia, anio, maxDias Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese el número del mes (1-12):"
        Leer mes
        Escribir "Ingrese el día:"
        Leer dia
        Escribir "Ingrese el año:"
        Leer anio
    
        // Identificar días del mes
        maxDias <- 0
        Segun mes Hacer
            1, 3, 5, 7, 8, 10, 12:
                maxDias <- 31
            4, 6, 9, 11:
                maxDias <- 30
            2:
                Si anio MOD 400 = 0 O (anio MOD 4 = 0 Y anio MOD 100 <> 0) Entonces
                    maxDias <- 29
                SiNo
                    maxDias <- 28
                FinSi
        FinSegun
    
        // Comprobar fecha
        Si anio <= 0 O mes < 1 O mes > 12 O dia < 1 O dia > maxDias Entonces
            Escribir "Fecha no válida"
        SiNo
            // Identificar estación
            Segun mes Hacer
                12, 1, 2:
                    Escribir "Verano"
                3, 4, 5:
                    Escribir "Otoño"
                6, 7, 8:
                    Escribir "Invierno"
                9, 10, 11:
                    Escribir "Primavera"
            FinSegun
        FinSi
Fin
