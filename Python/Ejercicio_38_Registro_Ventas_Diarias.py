# Ejercicio 38 Registro Ventas Diarias 
# Asignar los valores iniciales
total = 0
dias = 0
diasSuperiores = 0
mayorVenta = 0
diaMayor = 0

# Solicitar primera venta
venta = float(input("Ingrese la venta del día (-1 para terminar): "))

# Registrar ventas
while venta != -1:

    if venta >= 0:
        dias = dias + 1

        # Acumular ventas
        total = total + venta

        # Contar ventas superiores a $500
        if venta > 500:
            diasSuperiores = diasSuperiores + 1

        # Identificar venta máxima
        if dias == 1 or venta > mayorVenta:
            mayorVenta = venta
            diaMayor = dias

        # Solicitar siguiente venta
        venta = float(input("Ingrese la siguiente venta (-1 para terminar): "))
    else:
        print("La venta no puede ser negativa")
        venta = float(input("Ingrese nuevamente (-1 para terminar): "))

# Obtener promedio y mostrar resultados
if dias > 0:
    promedio = total / dias

    print("Total de ventas: $", total)
    print("Promedio de ventas: $", promedio)
    print("Días con ventas superiores a $500:", diasSuperiores)
    print("Mayor venta: $", mayorVenta)
    print("Día de la mayor venta:", diaMayor)
else:
    print("No se registraron ventas")
