# Ejercicio 28 Tipo de ecuacion cuadratica 
# Solicitar coeficientes
a = float(input("Ingrese el coeficiente a: "))
b = float(input("Ingrese el coeficiente b: "))
c = float(input("Ingrese el coeficiente c: "))

# Comprobar si es cuadrática
if a == 0:
    print("No es una ecuación cuadrática")
else:
    # Obtener discriminante
    discriminante = b**2 - 4 * a * c

    # Clasificar las soluciones
    if discriminante > 0:
        print("Tiene dos soluciones reales")
    elif discriminante == 0:
        print("Tiene una solución real")
    else:
        print("No tiene soluciones reales")
