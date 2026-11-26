# Ejercicio 11 Sueldo y horas extra 
# Declaracion de variables e ingreso de datos
# Solicitar las horas trabajadas
horas = float(input("Ingrese horas trabajadas: "))
# Solicitar el pago por hora
pagoHora = float(input("Ingrese pago por horas: "))
# Obtener sueldo si trabaja 40 horas o menos
if horas <= 40:
    sueldo = horas * pagoHora
# Obtener sueldo si trabaja mas de 40 horas
if horas > 40:
    sueldo = (40 * pagoHora) + ((horas - 40) * pagoHora * 2)
# Presentar el sueldo semanal
print("El sueldo semanal es:", sueldo)
