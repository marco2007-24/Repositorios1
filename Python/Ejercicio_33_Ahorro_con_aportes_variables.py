# Ejercicio 33 Ahorro con aportes variables 
# Solicitar cantidad de meses
N = int(input("Ingrese la cantidad de meses: "))

# Comprobar meses
if N > 0:
    # Asignar los valores iniciales
    saldo = 0
    mes = 1

    # Obtener ahorro mensual
    while mes <= N:
        aporte = float(input(f"Ingrese el aporte del mes {mes}: "))

        # Acumular aporte y aplicar interés
        saldo = saldo + aporte
        saldo = saldo * 1.008

        mes = mes + 1

    # Presentar el resultado calculado
    print("El saldo final es: $", saldo)
else:
    print("La cantidad de meses debe ser mayor que cero")
