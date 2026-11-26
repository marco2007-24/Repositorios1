// Ejercicio 44 Conversion decimal a hexadecimal
Algoritmo DecimalHexadecimal()
 Inicio
        // Definir los datos utilizados
        Definir numero, residuo Como Entero
        Definir hexadecimal, digito Como Cadena
    
        // Solicitar número
        Escribir "Ingrese un número entero no negativo:"
        Leer numero
    
        // Comprobar número
        Si numero >= 0 Entonces
            hexadecimal <- ""
    
            // Convertir a hexadecimal
            Si numero = 0 Entonces
                hexadecimal <- "0"
            SiNo
                Mientras numero > 0 Hacer
                    residuo <- numero MOD 16
    
                    // Obtener dígito hexadecimal
                    Segun residuo Hacer
                        10: digito <- "A"
                        11: digito <- "B"
                        12: digito <- "C"
                        13: digito <- "D"
                        14: digito <- "E"
                        15: digito <- "F"
                        De Otro Modo:
                            digito <- ConvertirATexto(residuo)
                    FinSegun
    
                    hexadecimal <- digito + hexadecimal
                    numero <- TRUNC(numero / 16)
                FinMientras
            FinSi

            // Presentar el resultado calculado
            Escribir "Número hexadecimal: ", hexadecimal
        SiNo
            Escribir "El número no puede ser negativo"
        FinSi
Fin
