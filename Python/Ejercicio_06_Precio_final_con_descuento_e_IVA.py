# Ejercicio 06 Precio final con descuento e IVA 
# Solicitar el precio del articulo
precioArticulo = float(input("Ingrese precio del articulo: "))
# Definir porcentaje de descuento e IVA
Descuento = 0.20
IVA = 0.15
# Obtener el valor del descuento
valorDescuento = precioArticulo * Descuento
# Obtener el precio con descuento
precioConDescuento = precioArticulo - valorDescuento
# Obtener el IVA sobre el precio con descuento
valorIVA = precioConDescuento * IVA
# Obtener el precio final incluyendo IVA
precioFinal = precioConDescuento + valorIVA
# Presentar los resultados obtenidos
print("El precio con descuento es:", precioConDescuento)
print("El precio final es:", precioFinal)
