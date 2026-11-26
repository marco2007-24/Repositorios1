# Ejercicio 21 Valor futuro de una anualidad 
# Leer los valores necesarios
depositoMensual = float(input("Ingrese depósito mensual: "))
tasaMensual = float(input("Ingrese tasa mensual: "))
meses = int(input("Ingrese número de meses: "))

if depositoMensual < 0 or tasaMensual < 0 or meses <= 0:
    print("Datos inválidos")
else:
    # Obtener total depositado
    totalDepositado = depositoMensual * meses

# Obtener valor futuro
    if tasaMensual == 0:
        valorFuturo = totalDepositado
    else:
        valorFuturo = depositoMensual * (((1 + tasaMensual)**meses - 1) / tasaMensual)

# Presentar los resultados calculados
    print("El valor total depositado es:", totalDepositado)
    print("El valor futuro es:", valorFuturo)
