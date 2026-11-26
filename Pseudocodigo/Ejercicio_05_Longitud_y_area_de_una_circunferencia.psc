// Ejercicio 05 Longitud y area de una circunferencia
Algoritmo longitud_Area_Circunferencia()
Inicio 
    // Definir los datos utilizados
    Definir radio, diametro, longitud, area Como Real

    // Solicitar radio
    Escribir "Ingrese radio de la circunferencia"
    Leer radio

    // Obtener diámetro, longitud y área
    diametro <- 2 * radio
    longitud <- 3.1416 * diametro
    area <- 3.1416 * radio^2

    // Presentar los resultados calculados
    Escribir "La longitud es: ", longitud
    Escribir "El área es: ", area
Fin
