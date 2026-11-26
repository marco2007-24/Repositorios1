// Ejercicio 52 Punto medio y distancia entre dos puntos
Algoritmo DistanciaPuntoMedio()
 Inicio
        // Definir los datos utilizados
        Definir x1, y1, x2, y2 Como Real
        Definir distancia, xm, ym Como Real
    
        // Solicitar coordenadas
        Escribir "Ingrese x1:"
        Leer x1
        Escribir "Ingrese y1:"
        Leer y1
        Escribir "Ingrese x2:"
        Leer x2
        Escribir "Ingrese y2:"
        Leer y2
    
        // Obtener distancia
        distancia <- RC((x2 - x1)^2 + (y2 - y1)^2)
    
        // Obtener punto medio
        xm <- (x1 + x2) / 2
        ym <- (y1 + y2) / 2
    
        // Presentar los resultados calculados
        Escribir "Distancia entre los puntos: ", distancia
        Escribir "Punto medio: (", xm, ", ", ym, ")"
Fin
