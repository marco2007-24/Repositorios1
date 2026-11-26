// Ejercicio 15 Menor de tres numeros
Algoritmo MenorDeTres()
  Inicio
            // Definir los datos utilizados
            Definir num1, num2, num3, menor Como Real
        
            // Solicitar los tres números
            Escribir "Ingrese el primer número:"
            Leer num1
            Escribir "Ingrese el segundo número:"
            Leer num2
            Escribir "Ingrese el tercer número:"
            Leer num3
        
            // Identificar el número menor
            Si (num1 <= num2 Y num1 <= num3) Entonces
                menor <- num1
            SiNo
                Si (num2 <= num1 Y num2 <= num3) Entonces
                    menor <- num2
                SiNo
                    menor <- num3
                FinSi
            FinSi
        
            // Presentar el resultado calculado
            Escribir "El menor de los tres números es: ", menor
 Fin
