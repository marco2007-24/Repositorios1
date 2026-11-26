// Ejercicio 45 Costo total de un viaje con peajes
Algoritmo CostoViaje()
 Inicio
        // Definir los datos utilizados
        Definir distancia, consumo, precio Como Real
        Definir litros, costoCombustible, costoPeajes Como Real
        Definir costoPeaje, total Como Real
        Definir N, i Como Entero
    
        // Leer los valores necesarios
        Escribir "Ingrese la distancia en km:"
        Leer distancia
        Escribir "Ingrese el rendimiento en km por litro:"
        Leer consumo
        Escribir "Ingrese el precio por litro:"
        Leer precio
        Escribir "Ingrese la cantidad de peajes:"
        Leer N
    
        // Comprobar que las entradas sean válidas
        Si distancia >= 0 Y consumo > 0 Y precio >= 0 Y N >= 0 Entonces
            costoPeajes <- 0
    
            // Acumular costos de peajes
            Para i <- 1 Hasta N Hacer
                Escribir "Ingrese el costo del peaje ", i, ":"
                Leer costoPeaje
                costoPeajes <- costoPeajes + costoPeaje
            FinPara
    
            // Obtener combustible y total
            litros <- distancia / consumo
            costoCombustible <- litros * precio
            total <- costoCombustible + costoPeajes
    
            // Presentar los resultados calculados
            Escribir "Litros necesarios: ", litros
            Escribir "Costo de combustible: $", costoCombustible
            Escribir "Costo de peajes: $", costoPeajes
            Escribir "Costo total del viaje: $", total
        SiNo
            Escribir "Datos no válidos"
        FinSi
Fin
