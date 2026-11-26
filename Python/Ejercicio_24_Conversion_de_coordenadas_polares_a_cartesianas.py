# Ejercicio 24 Conversion de coordenadas polares a cartesianas 
import math

# Leer los valores necesarios
radio = float(input("Ingrese el radio: "))
angulo = float(input("Ingrese el ángulo en grados: "))

# Convertir grados a radianes
radianes = math.radians(angulo)

# Obtener coordenadas cartesianas
x = radio * math.cos(radianes)
y = radio * math.sin(radianes)

# Presentar los resultados calculados
print("Coordenada X:", x)
print("Coordenada Y:", y)
