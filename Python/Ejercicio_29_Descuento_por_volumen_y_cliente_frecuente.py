# Ejercicio 29 Descuento por volumen y cliente frecuente 
# Leer los valores necesarios
monto = float(input("Ingrese el monto de la compra: "))
frecuente = input("¿Es cliente frecuente? (S/N): ").upper()

# Comprobar monto
if monto >= 0:
    # Identificar descuento por compra
    if monto >= 500:
        descuento = 15
    elif monto >= 300:
        descuento = 10
    elif monto >= 100:
        descuento = 5
    else:
        descuento = 0

    # Incorporar descuento adicional
    if frecuente == "S":
        descuento += 5

    # Obtener total a pagar
    total = monto - (monto * descuento / 100)

    # Presentar los resultados calculados
    print("Descuento aplicado:", descuento, "%")
    print("Total a pagar: $", round(total, 2))
else:
    print("El monto no puede ser negativo")
