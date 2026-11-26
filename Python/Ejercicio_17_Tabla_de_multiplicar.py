# Ejercicio 17 Tabla de multiplicar 
# Solicitar un numero entero
K = int(input("Ingrese un numero entero: "))
# Preparar el contador
i = 1
# Continuar mientras i sea menor o igual a 10
while i <= 10:
    # Obtener la multiplicacion
    resultado = K * i
    # Presentar el resultado obtenido
    print(K, "x", i, "=", resultado)
    # Incrementar el contador
    i = i + 1
