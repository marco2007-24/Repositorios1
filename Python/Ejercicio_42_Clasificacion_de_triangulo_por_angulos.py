# Ejercicio 42 Clasificacion de triangulo por angulos 
# Solicitar ángulos
a1 = float(input("Ingrese el primer ángulo: "))
a2 = float(input("Ingrese el segundo ángulo: "))
a3 = float(input("Ingrese el tercer ángulo: "))

# Comprobar ángulos
if a1 <= 0 or a2 <= 0 or a3 <= 0:
    print("Error: los ángulos deben ser positivos")
elif abs(a1 + a2 + a3 - 180) > 0.000001:
    print("Los ángulos no forman un triángulo")
else:
    # Clasificar triángulo
    if a1 == 90 or a2 == 90 or a3 == 90:
        print("Triángulo rectángulo")
    elif a1 > 90 or a2 > 90 or a3 > 90:
        print("Triángulo obtusángulo")
    else:
        print("Triángulo acutángulo")
