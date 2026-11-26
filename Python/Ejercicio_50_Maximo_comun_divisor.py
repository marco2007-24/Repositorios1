# Ejercicio 50 Maximo comun divisor 
# Leer los valores necesarios
a = int(input("Ingrese el primer número positivo: "))
b = int(input("Ingrese el segundo número positivo: "))

# Comprobar números
if a > 0 and b > 0:
    # Obtener MCD
    while b != 0:
        residuo = a % b
        a = b
        b = residuo

    # Presentar el resultado calculado
    print("El MCD es:", a)
else:
    print("Los números deben ser positivos")
