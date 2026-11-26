# Ejercicio 58 Conversor Monedas 

# Solicitar los valores de entrada
codigo = int(input("Código (1=EUR, 2=GBP, 3=JPY, 4=MXN): "))
monto = float(input("Monto en USD: "))

# Comprobar que las entradas sean válidas
if codigo < 1 or codigo > 4 or monto < 0:
    print("Datos inválidos")
else:
    # Asignar tasa y comisión según la moneda
    match codigo:
        case 1:
            tasa = 0.92
            comision = 0.01
            moneda = "EUR"
        case 2:
            tasa = 0.78
            comision = 0.01
            moneda = "GBP"
        case 3:
            tasa = 149
            comision = 0.015
            moneda = "JPY"
        case 4:
            tasa = 17.2
            comision = 0.02
            moneda = "MXN"

    # Obtener resultado con comisión
    comision_usd = monto * comision
    resultado = (monto - comision_usd) * tasa

    # Presentar los resultados calculados
    print(f"Resultado en {moneda}: {resultado:.2f}")
    print(f"Comisión en USD: ${comision_usd:.2f}")
