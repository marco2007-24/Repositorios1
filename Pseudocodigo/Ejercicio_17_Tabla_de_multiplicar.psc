// Ejercicio 17 Tabla de multiplicar
Algoritmo TablaMultiplicar()
 Inicio
            Definir K, i, resultado Como Entero
            Escribir "Ingrese un numero entero:"
            Leer K
            // Preparar el contador
            i <- 1
            // Continuar mientras i sea menor o igual a 10
            Mientras (i <= 10) Hacer
                resultado <- K * i
                Escribir K, " x ", i, " = ", resultado
                // Incrementar el contador
                i <- i + 1
            FinMientras
 Fin
