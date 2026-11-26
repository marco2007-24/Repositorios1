// Ejercicio 06 Precio final con descuento e IVA
Algoritmo precioFinalIVA()
Inicio 
    // Definir los datos utilizados
    Definir precioArticulo, precioFinal, precioConDescuento Como Real
    Definir valorDescuento, valorIVA, IVA, descuento Como Real

    // Solicitar precio
    Escribir "Ingrese precio del artículo"
    Leer precioArticulo

    // Definir porcentajes
    descuento <- 0.20
    IVA <- 0.15

    // Obtener descuento e IVA
    valorDescuento <- precioArticulo * descuento
    precioConDescuento <- precioArticulo - valorDescuento
    valorIVA <- precioConDescuento * IVA
    precioFinal <- precioConDescuento + valorIVA

    // Presentar los resultados calculados
    Escribir "El precio con descuento es: ", precioConDescuento
    Escribir "El precio final es: ", precioFinal
Fin
