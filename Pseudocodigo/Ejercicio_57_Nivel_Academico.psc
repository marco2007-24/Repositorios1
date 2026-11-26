// Ejercicio 57 Nivel Academico
Algoritmo NivelAcademico()
 Inicio
        // Definir los datos utilizados
        Definir promedio Como Real
        Definir repro, nivel Como Entero
        // Solicitar los valores de entrada
        Escribir "Promedio: "
        Leer promedio
        Escribir "Materias reprobadas: "
        Leer repro
        // Comprobar que las entradas sean válidas
        Si promedio < 0 O promedio > 10 O repro < 0 Entonces
            Escribir "Datos inválidos"
        SiNo
            // Clasificar el nivel académico
            nivel <- 4
            Si promedio >= 9 Y repro = 0 Entonces
                nivel <- 1
            SiNo
                Si promedio >= 8 Y repro <= 1 Entonces
                    nivel <- 2
                SiNo
                    Si promedio >= 7 Entonces
                        nivel <- 3
                    FinSi
                FinSi
            FinSi
            // Presentar resultado según el nivel
            Segun nivel Hacer
                1:
                    Escribir "Excelente - Continúa así"
                2:
                    Escribir "Bueno - Refuerza debilidades"
                3:
                    Escribir "Regular - Necesitas más estudio"
                4:
                    Escribir "En riesgo - Busca tutoría"
            FinSegun
        FinSi
 Fin
