# Ejercicio 22 Hipotenusa y area de triangulo rectangulo 
import math

# Solicitar catetos
a = float(input("Ingrese cateto a: "))
b = float(input("Ingrese cateto b: "))

# Obtener hipotenusa y área
c = math.sqrt(a**2 + b**2)
area = (a * b) / 2

# Presentar los resultados calculados
print("La hipotenusa es:", c)
print("El área del triángulo es:", area)
