# Ejercicio 25 Cuota de prestamo con interes simple 
# Leer los valores necesarios
capital = float(input("Ingrese el capital: "))
tasaAnual = float(input("Ingrese la tasa anual en porcentaje (12 para 12%): "))
meses = int(input("Ingrese los meses: "))

# Comprobar plazo
if meses > 0:
    # Obtener interés simple
    porcentaje = tasaAnual / 100
    interes = capital * porcentaje * (meses / 12)

    # Obtener cuota mensual
    cuotaMensual = (capital + interes) / meses

    # Presentar los resultados calculados
    print("El interés es:", interes)
    print("La cuota mensual es:", cuotaMensual)
else:
    print("El número de meses debe ser mayor que cero")
