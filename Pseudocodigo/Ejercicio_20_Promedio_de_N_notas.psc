// Ejercicio 20 Promedio de N notas
Algoritmo PromedioNotas()
  Inicio
        // Definir los datos utilizados
        Definir N, i Como Entero
        Definir nota, suma, promedio Como Real
        // Asignar los valores iniciales
        suma <- 0
        i <- 1
        // Solicitar cantidad de notas
        Escribir "Ingrese la cantidad de notas:"
        Leer N
        // Comprobar que la cantidad sea mayor que cero
        Si N > 0 Entonces
            // Continuar mientras i sea menor o igual a N
            Mientras i <= N Hacer
                // Solicitar la nota
                Escribir "Ingrese la nota ", i, ":"
                Leer nota
                // Acumular las notas
                suma <- suma + nota
                // Incrementar el contador
                i <- i + 1
            FinMientras
            // Obtener el promedio
            promedio <- suma / N
            // Presentar los resultados calculados
            Escribir "La suma de las notas es: ", suma
            Escribir "El promedio es: ", promedio
        SiNo
            Escribir "La cantidad de notas debe ser mayor que cero"
        FinSi
 Fin
