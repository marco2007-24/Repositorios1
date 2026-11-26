# Ejercicio 23 Costo de envio con peso volumetrico 
# Definir tarifa
tarifa = 2.50

# Leer los valores necesarios
peso = float(input("Ingrese peso real en kg: "))
largo = float(input("Ingrese largo en cm: "))
ancho = float(input("Ingrese ancho en cm: "))
alto = float(input("Ingrese alto en cm: "))

# Obtener peso volumétrico
pesoVolumetrico = (largo * ancho * alto) / 5000

# Identificar peso a cobrar
if peso > pesoVolumetrico:
    pesoCobrar = peso
else:
    pesoCobrar = pesoVolumetrico

# Obtener costo total
totalPagar = pesoCobrar * tarifa

# Presentar los resultados calculados
print("El peso a cobrar es:", pesoCobrar, "kg")
print("El total a pagar es: $", totalPagar)
