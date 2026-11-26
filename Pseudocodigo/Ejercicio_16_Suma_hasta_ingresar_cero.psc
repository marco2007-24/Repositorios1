// Ejercicio 16 Suma hasta ingresar cero
Algoritmo SumaNumeros()
  Inicio
        // Definir los datos utilizados
        Definir numero, suma Como Entero
    
        // Preparar suma
        suma <- 0
    
        // Solicitar primer número
        Escribir "Ingrese un número (0 para terminar):"
        Leer numero
    
        // Acumular números hasta ingresar cero
        Mientras numero <> 0 Hacer
            suma <- suma + numero
            Escribir "Ingrese otro número (0 para terminar):"
            Leer numero
        FinMientras
    
        // Presentar el resultado calculado
        Escribir "La suma total es: ", suma
 Fin
