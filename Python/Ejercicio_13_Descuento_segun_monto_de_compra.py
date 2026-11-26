# Ejercicio 13 Descuento segun monto de compra 
# Solicitar monto de compra
compra = float(input("Ingrese el monto de la compra: "))

# Identificar porcentaje de descuento
if compra >= 200:
    descuento = 0.15
elif compra >= 100:
    descuento = 0.10
else:
    descuento = 0.05

# Obtener total a pagar
total = compra - (compra * descuento)

# Presentar los resultados calculados
print("El descuento es:", descuento * 100, "%")
print("El total a pagar es: $", total)
