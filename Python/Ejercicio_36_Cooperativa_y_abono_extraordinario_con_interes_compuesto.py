# Ejercicio 36 Cooperativa y abono extraordinario con interes compuesto 
# Solicitar el monto del prestamo
montoPrestamo = float(input("Ingrese el monto del prestamo: "))
# Solicitar la tasa de interes trimestral
tasaTrimestral = float(input("Ingrese la tasa trimestral: "))
# Solicitar el porcentaje de abono
porcentajeAbono = float(input("Ingrese porcentaje abono: "))
# Solicitar el numero de trimestres
numeroTrimestres = int(input("Ingrese numero de trimestres: "))
# Comprobar datos; tasa decimal (0.05 = 5 %)
if montoPrestamo <= 0 or tasaTrimestral < 0 or not 0 <= porcentajeAbono <= 100 or numeroTrimestres < 0:
    print("Datos inválidos")
else:
    # Obtener interés compuesto y abono
    montoTotal = montoPrestamo * (1 + tasaTrimestral) ** numeroTrimestres
    abonoExtra = montoTotal * porcentajeAbono / 100
    abonoTotal = montoTotal - abonoExtra

    # Presentar los resultados calculados
    print("El monto antes del abono es:", montoTotal)
    print("El abono es:", abonoExtra)
    print("El monto final es:", abonoTotal)
