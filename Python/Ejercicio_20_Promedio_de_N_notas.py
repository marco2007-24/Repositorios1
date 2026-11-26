# Ejercicio 20 Promedio de N notas 
# Asignar los valores iniciales
suma = 0
i = 1
# Solicitar cantidad de notas
N = int(input("Ingrese la cantidad de notas: "))
# Comprobar que la cantidad sea mayor que cero
if N > 0:
    # Continuar mientras i sea menor o igual a N
    while i <= N:
        # Solicitar la nota
        nota = float(input(f"Ingrese la nota {i}: "))
        # Acumular las notas
        suma = suma + nota
        # Incrementar el contador
        i = i + 1
    # Obtener el promedio
    promedio = suma / N
    # Presentar los resultados obtenidos
    print("La suma de las notas es:", suma)
    print("El promedio es:", promedio)
else:
    # Presentar mensaje de error
    print("La cantidad de notas debe ser mayor que cero")
