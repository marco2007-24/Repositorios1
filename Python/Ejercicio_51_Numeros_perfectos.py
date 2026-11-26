# Ejercicio 51 Numeros perfectos 
# Solicitar número
N = int(input("Ingrese un número entero positivo: "))

# Comprobar número
if N > 0:
    # Preparar suma
    suma = 0

    # Acumular divisores propios
    for i in range(1, N):
        if N % i == 0:
            suma = suma + i

    # Comprobar número perfecto
    if suma == N:
        print(N, "es un número perfecto")
    else:
        print(N, "no es un número perfecto")
else:
    print("Debe ingresar un número positivo")
