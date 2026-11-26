# Ejercicio 43 Conversion decimal a binario 
# Solicitar número
numero = int(input("Ingrese un número entero no negativo: "))

# Comprobar número
if numero >= 0:
    binario = ""

    # Convertir a binario
    if numero == 0:
        binario = "0"
    else:
        while numero > 0:
            residuo = numero % 2
            binario = str(residuo) + binario
            numero = numero // 2

    # Presentar el resultado calculado
    print("Número binario:", binario)
else:
    print("El número no puede ser negativo")
