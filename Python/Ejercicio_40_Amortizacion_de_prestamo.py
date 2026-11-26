# Ejercicio 40 Amortizacion de prestamo 
# Leer los valores necesarios
monto = float(input("Ingrese el monto del préstamo: "))
tasa = float(input("Ingrese la tasa de interés mensual (%): "))
meses = int(input("Ingrese el número de meses: "))

# Comprobar monto, tasa y plazo
if monto > 0 and tasa >= 0 and meses > 0:
    # Obtener interés simple
    interes = monto * (tasa / 100) * meses

    # Obtener cuota mensual
    cuota = (monto + interes) / meses

    # Presentar los resultados calculados
    print("Interés total: $", interes)
    print("Cuota mensual: $", cuota)
else:
    print("Datos inválidos: monto positivo, tasa no negativa y meses mayores que cero")
