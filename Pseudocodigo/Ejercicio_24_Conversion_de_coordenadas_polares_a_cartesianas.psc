// Ejercicio 24 Conversion de coordenadas polares a cartesianas
Algoritmo conversionCoordenadas()
 Inicio
        // Definir los datos utilizados
        Definir radio, angulo, radianes, x, y Como Real
    
        // Leer los valores necesarios
        Escribir "Ingrese el radio:"
        Leer radio
        Escribir "Ingrese el ángulo en grados:"
        Leer angulo
    
        // Convertir grados a radianes
        radianes <- (angulo * PI) / 180
    
        // Obtener coordenadas cartesianas
        x <- radio * COS(radianes)
        y <- radio * SEN(radianes)
    
        // Presentar los resultados calculados
        Escribir "Coordenada X: ", x
        Escribir "Coordenada Y: ", y
 Fin
