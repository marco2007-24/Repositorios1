# Ejercicio 07 Gasto semanal de transporte 
# Declaracion de variables e ingreso de datos
# Solicitar la cantidad de viajes por dia
viajesDia = int(input("Ingrese viajes por dia: "))
# Solicitar los dias que viaja
diasSemana = int(input("Ingrese cuantos dias viaja: "))
# Solicitar el costo del pasaje
pasaje = float(input("Ingrese costo del pasaje: "))
# Obtener el gasto total de transporte
gastoTotal = viajesDia * diasSemana * pasaje
# Presentar el resultado obtenido
print("El gasto total es:", gastoTotal)
