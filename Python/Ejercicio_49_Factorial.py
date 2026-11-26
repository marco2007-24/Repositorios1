# Ejercicio 49 Factorial 
# Solicitar número
n = int(input("Ingrese un número: "))

# Comprobar número
if n >= 0:
    # Preparar factorial
    factorial = 1

    # Obtener factorial
    for i in range(1, n + 1):
        factorial = factorial * i

    # Presentar el resultado calculado
    print("Factorial de", n, ":", factorial)
else:
    print("Número no válido")
