// Ejercicio 34 Contar y sumar multiplos de 3 y 5
Algoritmo multiplosDe3y5()
  Inicio
        // Definir los datos utilizados
        Definir N, i, cantidad, suma Como Entero
    
        // Solicitar número
        Escribir "Ingrese el valor de N:"
        Leer N
    
        // Comprobar número
        Si N > 0 Entonces
            // Asignar los valores iniciales
            i <- 1
            cantidad <- 0
            suma <- 0
    
            // Buscar múltiplos de 3 y 5
            Mientras i <= N Hacer
                Si i MOD 3 = 0 O i MOD 5 = 0 Entonces
                    cantidad <- cantidad + 1
                    suma <- suma + i
                FinSi
                i <- i + 1
            FinMientras
    
            // Presentar los resultados calculados
            Escribir "Cantidad de múltiplos: ", cantidad
            Escribir "Suma de los múltiplos: ", suma
        SiNo
            Escribir "N debe ser mayor que cero"
        FinSi
 Fin
