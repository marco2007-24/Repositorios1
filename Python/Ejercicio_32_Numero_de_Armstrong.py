# Ejercicio 32 Numero de Armstrong 
# Solicitar número
numero = int(input("Ingrese un número de tres dígitos: "))

# Comprobar número
if 100 <= numero <= 999:
    # Asignar los valores iniciales
    original = numero
    suma = 0

    # Extraer y elevar los dígitos al cubo
    while numero > 0:
        digito = numero % 10
        suma = suma + (digito * digito * digito)
        numero = numero // 10

    # Comprobar número de Armstrong
    if suma == original:
        print("Es un número de Armstrong")
    else:
        print("No es un número de Armstrong")
else:
    print("Debe ingresar un número de tres dígitos")
