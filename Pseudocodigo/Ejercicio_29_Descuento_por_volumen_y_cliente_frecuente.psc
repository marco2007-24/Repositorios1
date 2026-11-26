// Ejercicio 29 Descuento por volumen y cliente frecuente
Algoritmo descuentoTienda()
 Inicio
        // Definir los datos utilizados
        Definir monto, descuento, total Como Real
        Definir frecuente Como Cadena
    
        // Leer los valores necesarios
        Escribir "Ingrese el monto de la compra:"
        Leer monto
        Escribir "¿Es cliente frecuente? (S/N):"
        Leer frecuente
    
        // Comprobar monto
        Si (monto >= 0) Entonces
            descuento <- 0
    
            // Identificar descuento por compra
            Si (monto >= 500) Entonces
                descuento <- 15
            SiNo
                Si (monto >= 300) Entonces
                    descuento <- 10
                SiNo
                    Si (monto >= 100) Entonces
                        descuento <- 5
                    FinSi
                FinSi
            FinSi
    
            // Incorporar descuento adicional
            Si (Mayusculas(frecuente) = "S") Entonces
                descuento <- descuento + 5
            FinSi
    
            // Obtener total a pagar
            total <- monto - (monto * descuento / 100)
    
            // Presentar los resultados calculados
            Escribir "Descuento aplicado: ", descuento, "%"
            Escribir "Total a pagar: $", total
        SiNo
            Escribir "El monto no puede ser negativo"
        FinSi
Fin
