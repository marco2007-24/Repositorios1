// Ejercicio 50 Maximo comun divisor
Algoritmo MaximoComunDivisor()
 Inicio
        // Definir los datos utilizados
        Definir a, b, residuo Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese el primer número positivo:"
        Leer a
        Escribir "Ingrese el segundo número positivo:"
        Leer b
    
        // Comprobar números
        Si a > 0 Y b > 0 Entonces
            // Obtener MCD
            Mientras b <> 0 Hacer
                residuo <- a MOD b
                a <- b
                b <- residuo
            FinMientras
    
            // Presentar el resultado calculado
            Escribir "El MCD es: ", a
        SiNo
            Escribir "Los números deben ser positivos"
        FinSi
Fin
