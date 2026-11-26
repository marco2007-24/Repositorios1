// Ejercicio 35 Inversion de un numero
Algoritmo inversionNumero()
 Inicio
        // Definir los datos utilizados
        Definir numero, original, digito, invertido Como Entero
    
        // Solicitar número
        Escribir "Ingrese un número entero positivo:"
        Leer numero
    
        // Comprobar número
        Si numero > 0 Entonces
            // Asignar los valores iniciales
            original <- numero
            invertido <- 0
    
            // Invertir los dígitos
            Mientras numero > 0 Hacer
                digito <- numero MOD 10
                invertido <- invertido * 10 + digito
                numero <- TRUNC(numero / 10)
            FinMientras
    
            // Presentar los resultados calculados
            Escribir "Número original: ", original
            Escribir "Número invertido: ", invertido
        SiNo
            Escribir "Debe ingresar un número positivo"
        FinSi
Fin
