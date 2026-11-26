// Ejercicio 43 Conversion decimal a binario
Algoritmo DecimalBinario()
 Inicio
        // Definir los datos utilizados
        Definir numero, residuo Como Entero
        Definir binario Como Cadena
    
        // Solicitar número
        Escribir "Ingrese un número entero no negativo:"
        Leer numero
    
        // Comprobar número
        Si numero >= 0 Entonces
            binario <- ""
    
            // Convertir a binario
            Si numero = 0 Entonces
                binario <- "0"
            SiNo
                Mientras numero > 0 Hacer
                    residuo <- numero MOD 2
                    binario <- ConvertirATexto(residuo) + binario
                    numero <- TRUNC(numero / 2)
                FinMientras
            FinSi

            // Presentar el resultado calculado
            Escribir "Número binario: ", binario
        SiNo
            Escribir "El número no puede ser negativo"
        FinSi
Fin
