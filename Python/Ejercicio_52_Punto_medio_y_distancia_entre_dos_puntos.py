# Ejercicio 52 Punto medio y distancia entre dos puntos 
import math

# Solicitar coordenadas
x1 = float(input("Ingrese x1: "))
y1 = float(input("Ingrese y1: "))
x2 = float(input("Ingrese x2: "))
y2 = float(input("Ingrese y2: "))

# Obtener distancia
distancia = math.sqrt((x2 - x1)**2 + (y2 - y1)**2)

# Obtener punto medio
xm = (x1 + x2) / 2
ym = (y1 + y2) / 2

# Presentar los resultados calculados
print("Distancia entre los puntos:", distancia)
print("Punto medio: (", xm, ",", ym, ")")
