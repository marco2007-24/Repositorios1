# Ejercicio 35 Inversion de un numero 
# Solicitar número
numero = int(input("Ingrese un número entero positivo: "))

# Comprobar número
if numero > 0:
    # Asignar los valores iniciales
    original = numero
    invertido = 0

    # Invertir los dígitos
    while numero > 0:
        digito = numero % 10
        invertido = invertido * 10 + digito
        numero = numero // 10

    # Presentar los resultados calculados
    print("Número original:", original)
    print("Número invertido:", invertido)
else:
    print("Debe ingresar un número positivo")
