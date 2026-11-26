# Ejercicio 39 Ahorro con interes compuesto 
# Leer los valores necesarios
capital = float(input("Ingrese el capital inicial: "))
deposito = float(input("Ingrese el depósito mensual: "))
N = int(input("Ingrese la cantidad de meses: "))
tasa = float(input("Ingrese la tasa mensual en porcentaje: "))

# Preparar saldo
saldo = capital

# Obtener ahorro mensual
for mes in range(1, N + 1):
    saldo = (saldo + deposito) * (1 + tasa / 100)
    print("Saldo del mes", mes, ": $", saldo)

# Presentar el resultado calculado
print("Saldo final: $", saldo)
