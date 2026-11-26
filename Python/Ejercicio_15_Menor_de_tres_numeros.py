# Ejercicio 15 Menor de tres numeros 
# Solicitar el primer numero
num1 = float(input("Ingrese el primer numero: "))
# Solicitar el segundo numero
num2 = float(input("Ingrese el segundo numero: "))
# Solicitar el tercer numero
num3 = float(input("Ingrese el tercer numero: "))
# Comprobar si el primer numero es el menor
if num1 <= num2 and num1 <= num3:
    menor = num1
# Si no, verificar si el segundo numero es el menor
else:
    if num2 <= num1 and num2 <= num3:
        menor = num2
    # Si no, el tercer numero es el menor
    else:
        menor = num3
# Presentar el numero menor
print("El menor de los tres numeros es:", menor)
