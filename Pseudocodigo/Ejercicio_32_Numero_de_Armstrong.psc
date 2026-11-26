// Ejercicio 32 Numero de Armstrong
Algoritmo numeroArmstrong()
 Inicio
        // Definir los datos utilizados
        Definir numero, original, digito, suma Como Entero
    
        // Solicitar número
        Escribir "Ingrese un número de tres dígitos:"
        Leer numero
    
        // Comprobar número
        Si numero >= 100 Y numero <= 999 Entonces
            // Asignar los valores iniciales
            original <- numero
            suma <- 0
    
            // Extraer y elevar los dígitos al cubo
            Mientras numero > 0 Hacer
                digito <- numero MOD 10
                suma <- suma + (digito * digito * digito)
                numero <- TRUNC(numero / 10)
            FinMientras
    
            // Comprobar número de Armstrong
            Si suma = original Entonces
                Escribir "Es un número de Armstrong"
            SiNo
                Escribir "No es un número de Armstrong"
            FinSi
        SiNo
            Escribir "Debe ingresar un número de tres dígitos"
        FinSi
Fin
