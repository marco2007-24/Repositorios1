// Ejercicio 13 Descuento segun monto de compra
Algoritmo DescuentoCompra()
Inicio
        // Definir los datos utilizados
        Definir compra, descuento, total Como Real
    
        // Solicitar monto de compra
        Escribir "Ingrese el monto de la compra:"
        Leer compra
    
        // Identificar porcentaje de descuento
        Si compra >= 200 Entonces
            descuento <- 0.15
        SiNo
            Si compra >= 100 Entonces
                descuento <- 0.10
            SiNo
                descuento <- 0.05
            FinSi
        FinSi
    
        // Obtener total a pagar
        total <- compra - (compra * descuento)
    
        // Presentar los resultados calculados
        Escribir "El descuento es: ", descuento * 100, "%"
        Escribir "El total a pagar es: $", total
Fin
