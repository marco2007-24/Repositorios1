// Ejercicio 49 Factorial
Algoritmo factorialNumero()
 Inicio
        // Definir los datos utilizados
        Definir n, i, factorial Como Entero
    
        // Solicitar número
        Escribir "Ingrese un número:"
        Leer n
    
        // Comprobar número
        Si n >= 0 Entonces
            // Preparar factorial
            factorial <- 1
    
            // Obtener factorial
            Para i <- 1 Hasta n Hacer
                factorial <- factorial * i
            FinPara
    
            // Presentar el resultado calculado
            Escribir "Factorial de ", n, ": ", factorial
        SiNo
            Escribir "Número no válido"
        FinSi
Fin
