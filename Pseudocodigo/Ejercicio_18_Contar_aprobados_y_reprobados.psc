// Ejercicio 18 Contar aprobados y reprobados
Algoritmo ContarAprobados()
  Inicio
        // Definir los datos utilizados
        Definir N, i, aprobados, reprobados Como Entero
        Definir nota Como Real
        // Preparar contadores
        aprobados <- 0
        reprobados <- 0
        i <- 1
        // Solicitar cantidad de estudiantes
        Escribir "Ingrese la cantidad de estudiantes:"
        Leer N
        // Continuar mientras i sea menor o igual a N
        Mientras i <= N Hacer
            // Solicitar nota del estudiante
            Escribir "Ingrese la nota del estudiante ", i, ":"
            Leer nota
            // Comprobar si el estudiante aprobo
            Si nota >= 7 Entonces
                aprobados <- aprobados + 1
            SiNo
                reprobados <- reprobados + 1
            FinSi
            // Incrementar el contador
            i <- i + 1
        FinMientras
        // Presentar los resultados calculados
        Escribir "Cantidad de aprobados: ", aprobados
        Escribir "Cantidad de reprobados: ", reprobados
  Fin
