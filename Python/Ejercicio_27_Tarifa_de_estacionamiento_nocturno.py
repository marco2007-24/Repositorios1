# Ejercicio 27 Tarifa de estacionamiento nocturno 
# Leer los valores necesarios
horas = float(input("Ingrese las horas de estacionamiento: "))
nocturno = input("¿Es horario nocturno? (S/N): ").upper()

# Comprobar horas
if horas > 0:
    # Obtener tarifa base
    tarifa = horas * 1.50

    # Incorporar recargo por tiempo
    if horas > 8:
        tarifa = tarifa * 1.25

    # Incorporar recargo nocturno
    if nocturno == "S":
        tarifa = tarifa * 1.30

    # Presentar el resultado calculado
    total = tarifa
    print("Total a pagar: $", round(total, 2))
else:
    print("Las horas deben ser mayores que cero")
