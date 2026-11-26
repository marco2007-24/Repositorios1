# Ejercicio 41 Bono por productividad 
# Leer los valores necesarios
sueldo = float(input("Ingrese el sueldo base: "))
productividad = float(input("Ingrese el porcentaje de productividad: "))

# Identificar porcentaje de bono
if productividad >= 90:
    porcentaje = 0.20
elif productividad >= 70:
    porcentaje = 0.10
elif productividad >= 50:
    porcentaje = 0.05
else:
    porcentaje = 0

# Obtener bono y sueldo total
bono = sueldo * porcentaje
total = sueldo + bono

# Presentar los resultados calculados
print("Bono recibido: $", bono)
print("Total a pagar: $", total)
