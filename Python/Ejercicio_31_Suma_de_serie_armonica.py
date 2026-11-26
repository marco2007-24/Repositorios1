# Ejercicio 31 Suma de serie armonica 
# Leer los valores necesarios
N = int(input("Ingrese el valor de N: "))

# Comprobar número
if N > 0:
    # Asignar los valores iniciales
    suma = 0
    i = 1

    # Obtener suma de la serie
    while i <= N:
        suma = suma + (1 / i)
        i = i + 1

    # Presentar el resultado calculado
    print("La suma de la serie es:", suma)
else:
    print("N debe ser mayor que cero")
