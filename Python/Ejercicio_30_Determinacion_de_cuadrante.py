# Ejercicio 30 Determinacion de cuadrante 
# Solicitar coordenadas
x = float(input("Ingrese la coordenada x: "))
y = float(input("Ingrese la coordenada y: "))

# Identificar posición del punto
if x == 0 and y == 0:
    print("El punto está en el origen")
elif x == 0:
    print("El punto está sobre el eje Y")
elif y == 0:
    print("El punto está sobre el eje X")

# Identificar cuadrante
elif x > 0 and y > 0:
    print("Primer cuadrante")
elif x < 0 and y > 0:
    print("Segundo cuadrante")
elif x < 0 and y < 0:
    print("Tercer cuadrante")
else:
    print("Cuarto cuadrante")
