// Ejercicio 10 Area y perimetro de un rectangulo
Algoritmo AreaPerimetro()
Inicio 
    // Definir los datos utilizados
    Definir largo, ancho, area, perimetro Como Real

    // Leer los valores necesarios
    Escribir "Ingrese largo del terreno"
    Leer largo
    Escribir "Ingrese ancho del terreno"
    Leer ancho

    // Obtener área y perímetro
    area <- largo * ancho
    perimetro <- 2 * (largo + ancho)

    // Presentar los resultados calculados
    Escribir "El área del terreno es: ", area
    Escribir "El perímetro del terreno es: ", perimetro
Fin
