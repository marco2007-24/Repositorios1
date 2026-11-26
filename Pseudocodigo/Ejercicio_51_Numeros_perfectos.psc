// Ejercicio 51 Numeros perfectos
Algoritmo NumeroPerfecto()
 Inicio
        // Definir los datos utilizados
        Definir N, i, suma Como Entero
    
        // Solicitar número
        Escribir "Ingrese un número entero positivo:"
        Leer N
    
        // Comprobar número
        Si N > 0 Entonces
            // Preparar suma
            suma <- 0
    
            // Acumular divisores propios
            Para i <- 1 Hasta N - 1 Hacer
                Si N MOD i = 0 Entonces
                    suma <- suma + i
                FinSi
            FinPara
    
            // Comprobar número perfecto
            Si suma = N Entonces
                Escribir N, " es un número perfecto"
            SiNo
                Escribir N, " no es un número perfecto"
            FinSi
        SiNo
            Escribir "Debe ingresar un número positivo"
        FinSi
 Fin
