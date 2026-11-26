# Ejercicio 05 Longitud y area de una circunferencia 
import math

# Solicitar radio
radio = float(input("Ingrese radio de la circunferencia: "))

# Obtener diámetro, longitud y área
diametro = 2 * radio
longitud = math.pi * diametro
area = math.pi * radio**2

# Presentar los resultados calculados
print("La longitud es:", longitud)
print("El área es:", area)
