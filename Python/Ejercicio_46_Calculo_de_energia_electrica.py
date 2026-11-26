# Ejercicio 46 Calculo de energia electrica 
# Leer los valores necesarios
potencia = float(input("Ingrese la potencia en watts: "))
horas = float(input("Ingrese las horas de uso diario: "))
tarifa = float(input("Ingrese la tarifa por kWh: "))

# Obtener consumo mensual
consumo = (potencia / 1000) * horas * 30

# Obtener costo mensual
costo = consumo * tarifa

# Presentar los resultados calculados
print("Consumo mensual en kWh:", consumo)
print("Costo mensual: $", costo)
