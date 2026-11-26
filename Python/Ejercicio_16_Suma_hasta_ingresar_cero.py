# Ejercicio 16 Suma hasta ingresar cero 
# Preparar la suma en cero
suma = 0
# Solicitar el primer numero
numero = int(input("Ingrese un numero (0 para terminar): "))
# Continuar mientras el numero sea diferente de cero
while numero != 0:
    # Acumular el numero ingresado
    suma = suma + numero
    # Solicitar otro numero
    numero = int(input("Ingrese otro numero (0 para terminar): "))
# Presentar la suma total
print("La suma total es:", suma)
