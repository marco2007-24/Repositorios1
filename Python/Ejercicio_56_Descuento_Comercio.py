# Ejercicio 56 Descuento Comercio 
# Solicitar los valores de entrada
categoria = int(input("Categoría (1-4): "))
cantidad = int(input("Cantidad: "))
precio = float(input("Precio unitario: "))
# Comprobar los valores introducidos
if categoria < 1 or categoria > 4 or cantidad <= 0 or precio < 0:
    print("Datos inválidos")
else:
    # Preparar descuento
    descuento = 0
    # Descuento según categoría y cantidad
    match categoria:
        case 1:
            if cantidad >= 10:
                descuento = 0.05

        case 2:
            if cantidad >= 5:
                descuento = 0.10

        case 3:
            descuento = 0.03

        case 4:
            descuento = 0
    # Obtener total con descuento
    total = precio * cantidad * (1 - descuento)
    # Incorporar descuento adicional del 2 %
    if total > 100:
        total *= 0.98
    # Presentar el resultado calculado
    print(f"Total a pagar: ${total:.2f}")
