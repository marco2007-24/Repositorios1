// Ejercicio 22 Hipotenusa y area de triangulo rectangulo
Algoritmo trianguloRectanguloHipotenusaArea()
 Incio
        // Definir los datos utilizados
        Definir a, b, c, area Como Real
    
        // Solicitar catetos
        Escribir "Ingrese cateto a:"
        Leer a
        Escribir "Ingrese cateto b:"
        Leer b
    
        // Obtener hipotenusa y área
        c <- RC(a^2 + b^2)
        area <- (a * b) / 2
    
        // Presentar los resultados calculados
        Escribir "La hipotenusa es: ", c
        Escribir "El área del triángulo es: ", area
 Fin
