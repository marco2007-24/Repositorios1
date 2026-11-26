// Ejercicio 60 Beca Bachillerato
Algoritmo BecaBachillerato()
 Inicio
    // Definir los datos utilizados
        Definir nivel Como Entero
        Definir promedio, asistencia, beca Como Real
        // Solicitar los valores de entrada
        Escribir "Promedio (0-10): "
        Leer promedio
        Escribir "Asistencia (%): "
        Leer asistencia
        Escribir "Nivel (1=Bajo, 2=Medio, 3=Alto): "
        Leer nivel
        // Comprobar que las entradas sean válidas
        Si promedio < 0 O promedio > 10 O asistencia < 0 O asistencia > 100 O nivel < 1 O nivel > 3 Entonces
            Escribir "Datos inválidos"
        SiNo
            // Preparar beca
            beca <- 0
            // Asignar beca según rendimiento y nivel
            Si promedio >= 9 Y asistencia >= 95 Entonces
                Segun nivel Hacer
                    1:
                        beca <- 100
                    2:
                        beca <- 70
                    3:
                        beca <- 40
                FinSegun
            SiNo
                Si promedio >= 8 Y asistencia >= 85 Entonces
                    Si nivel <= 2 Entonces
                        beca <- 50
                    SiNo
                        beca <- 20
                    FinSi
                SiNo
                    Si promedio >= 7 Y asistencia >= 75 Y nivel = 1 Entonces
                        beca <- 25
                    FinSi
                FinSi
            FinSi
            // Presentar el resultado calculado
            Escribir "Porcentaje de beca: ", beca, "%"

            Si beca > 0 Entonces
                Escribir "Sigue esforzándote"
            SiNo
                Escribir "Puedes mejorar"
            FinSi
        FinSi
 Fin
