# Ejercicio 61 Descuento Comercial 
# Solicitar los valores de entrada
categoria = int(input("Categoría (1=Elec, 2=Ropa, 3=Alim): "))
cantidad = int(input("Cantidad: "))
precio = float(input("Precio unitario: "))
membresia = input("¿Tiene membresía? (S/N): ").upper()
# Comprobar que las entradas sean válidas
if categoria not in (1, 2, 3) or cantidad <= 0 or precio < 0:
    print("Datos inválidos")
else:
    # Obtener subtotal
    subtotal = cantidad * precio
    descuento = 0
    # Descuento según categoría
    match categoria:
        case 1:
            if cantidad >= 5:
                descuento = subtotal * 0.08
        case 2:
            if cantidad >= 3:
                descuento = subtotal * 0.12
        case 3:
            descuento = subtotal * 0.05
    # Descuento por membresía
    if membresia == "S":
        descuento += subtotal * 0.05
    total = subtotal - descuento
    # Descuento extra por monto
    if total > 100:
        descuento += total * 0.03
        total = subtotal - descuento
    # Presentar los resultados calculados
    print(f"Subtotal: ${subtotal:.2f}")
    print(f"Descuento: ${descuento:.2f}")
    print(f"Total a pagar: ${total:.2f}")
