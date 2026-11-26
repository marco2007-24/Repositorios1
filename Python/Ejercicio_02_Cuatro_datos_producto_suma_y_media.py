# Ejercicio 02 Cuatro datos producto suma y media
# Leer los valores necesarios 
dato1 = int(input("Ingrese dato 1: "))
dato2 = int(input("Ingrese dato 2: "))
dato3 = int(input("Ingrese dato 3: "))
dato4 = int(input("Ingrese dato 4: "))

# Obtener suma, producto y media
suma = dato1 + dato2 + dato3 + dato4
producto = dato1 * dato2 * dato3 * dato4
mediaAritmetica = suma / 4

# Presentar los resultados calculados
print("La suma es:", suma)
print("El producto es:", producto)
print("La media aritmética es:", mediaAritmetica)
