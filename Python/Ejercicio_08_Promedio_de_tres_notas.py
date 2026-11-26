# Ejercicio 08 Promedio de tres notas
# Solicitar primera calificación
calificacion1 = float(input("Ingrese calificación 1: "))

# Comprobar primera calificación
while calificacion1 < 0 or calificacion1 > 10:
    print("Nota incorrecta, ingrese nuevamente")
    calificacion1 = float(input("Ingrese calificación 1: "))

# Solicitar segunda calificación
calificacion2 = float(input("Ingrese calificación 2: "))

# Comprobar segunda calificación
while calificacion2 < 0 or calificacion2 > 10:
    print("Nota incorrecta, ingrese nuevamente")
    calificacion2 = float(input("Ingrese calificación 2: "))

# Solicitar tercera calificación
calificacion3 = float(input("Ingrese calificación 3: "))

# Comprobar tercera calificación
while calificacion3 < 0 or calificacion3 > 10:
    print("Nota incorrecta, ingrese nuevamente")
    calificacion3 = float(input("Ingrese calificación 3: "))

# Obtener promedio
promedio = (calificacion1 + calificacion2 + calificacion3) / 3

# Presentar el resultado calculado
print("El promedio de las tres notas es:", promedio)
